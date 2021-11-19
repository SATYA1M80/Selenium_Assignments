package SeleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Q8_testmethod_qus {

	WebDriver driver;

    WebDriverWait wait;

    By txtbox_username = By.xpath("//input[@id='txtUsername']");

    By txtbox_password = By.xpath("//input[@id='txtPassword']");

    By button_login = By.xpath("//div[@id='divLoginButton']//input");

    By table_admin = By.xpath("//b[text()='Admin']");

    By table_pim = By.xpath("//b[text()='PIM']");

    By table_Leave = By.xpath("//b[text()='Leave']");

    By table_Dashboard = By.xpath("//b[text()='Dashboard']");

    By table_Directory = By.xpath("//b[text()='Directory']");

    By table_Maintenance = By.xpath("//b[text()='Maintenance']");
 
    @BeforeSuite

    public void launchBrowser() throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");

         driver = new ChromeDriver();

         wait = new WebDriverWait(driver, 5000);       

    }

    @Test(priority = 0)

    public void openURL() throws InterruptedException {

         driver.get("https://opensource-demo.orangehrmlive.com/");

         driver.manage().window().maximize();

         Thread.sleep(2000);

    driver.findElement(txtbox_username).sendKeys("Admin");

    driver.findElement(txtbox_password).sendKeys("admin123");

         driver.findElement(button_login).click();

    }

    @Test(priority = 1)

    public void admins() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_admin)));

         driver.findElement(table_admin).click();

         System.out.println(driver.getTitle());
     
    }

    @Test(priority = 2)

    public void pims() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_pim)));

         driver.findElement(table_pim).click();

         System.out.println(driver.getTitle());
     
    }

    @Test(priority = 3)

    public void Leaves() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_Leave)));

         driver.findElement(table_Leave).click();

         System.out.println(driver.getTitle());      

    }

    @Test(priority = 4)

    public void Dashboards() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_Dashboard)));

          driver.findElement(table_Dashboard).click();

         System.out.println(driver.getTitle());
   
    }

    @Test(priority = 5)

    public void Directorys() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_Directory)));

          driver.findElement(table_Directory).click();

         System.out.println(driver.getTitle());       

    }

    @Test(priority = 6)

    public void Maintenances() throws InterruptedException {

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(table_Maintenance)));

          driver.findElement(table_Maintenance).click();

         System.out.println(driver.getTitle());

    }
 
    @AfterSuite

    public void quit() {

         driver.manage().window().setPosition(new Point(-2000, 0));

         driver.quit();

    }

}
