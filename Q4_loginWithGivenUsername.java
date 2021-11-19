package SeleniumAssignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4_loginWithGivenUsername {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB);
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.TAB);
			WebElement login=driver.findElement(By.name("Submit"));
			login.click();
			String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);

	}

}
