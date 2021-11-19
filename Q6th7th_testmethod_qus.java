package SeleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Q6th7th_testmethod_qus {

	WebDriver driver;

    By txtbox_username = By.xpath("//input[@id='txtUsername']");

    By txtbox_password = By.xpath("//input[@id='txtPassword']");

    By button_login= By.xpath("//div[@id='divLoginButton']//input");

    @BeforeSuite

    public void launchBrowser() throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");

         driver = new ChromeDriver();
     
    }

    @Test(priority=1)

    public void openURL() throws InterruptedException {

         driver.get("https://opensource-demo.orangehrmlive.com/");

         driver.manage().window().maximize();

         Thread.sleep(2000);

    driver.findElement(txtbox_username).sendKeys("Admin");

    driver.findElement(txtbox_password).sendKeys("admin123");

         driver.findElement(button_login).click();

         driver.quit();

    }

}
