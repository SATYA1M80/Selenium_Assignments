package step_defination_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_def_1 {

	
	public ChromeDriver driver;
	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options1);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}

	@Then("^Login into Application$")
	public void login_into_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
	}

	@And("^click on Admin menu$")
	public void click_on_Admin_menu() throws Throwable {
	   driver.findElementByXPath("//b[contains(text(),'Admin')]").click();
	   Thread.sleep(3000);
	   driver.close();
	}
}
