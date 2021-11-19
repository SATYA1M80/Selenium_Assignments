package SeleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Q9thQ10th_dashboard_qus {

	public static void main(String[] args) {
		
		By txtbox_username = By.xpath("//input[@id='txtUsername']");

        By txtbox_password = By.xpath("//input[@id='txtPassword']");

        By button_login = By.xpath("//div[@id='divLoginButton']//input");

        By table_Dashboard = By.xpath("//b[text()='Dashboard']");

        By highdefination_Dashboard = By.xpath("//h1");

         System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

   wait.until(ExpectedConditions.visibilityOfElementLocated(txtbox_username));

   driver.findElement(txtbox_username).sendKeys("Admin");

   driver.findElement(txtbox_password).sendKeys("admin123");

        driver.findElement(button_login).click();

        String text = driver.findElement(highdefination_Dashboard).getText();

        System.out.println(text);

        //this below line for ninth question

        driver.manage().window().setPosition(new Point(-1500, 0));

        driver.quit();	

	}

}
