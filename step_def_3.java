package step_defination_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_def_3 {

	ChromeDriver driver;
	@Given("^Open OrangeHRP$")
	public void open_OrangeHRP() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");
		ChromeOptions option1 = new ChromeOptions();
		option1.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option1);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}

	@Then("^Login Orange Portal$")
	public void login_Orange_Portal() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
	}

	@Then("^Dashboard is available$")
	public void dashboard_is_available() throws Throwable {
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
	}

	@Then("^click Admin menu$")
	public void click_Admin_menu() throws Throwable {
		driver.findElementByXPath("//b[contains(text(),'Admin')]").click();
	}

	@Then("^Click Job$")
	public void click_Job() throws Throwable {
		
	}

	@Then("^validate text JobTitle$")
	public void validate_text_JobTitle() throws Throwable {
		driver.findElementByXPath("//a[@id='menu_admin_Job']").click();
	}

	@Then("^Click PIM$")
	public void click_PIM() throws Throwable {
		driver.findElementByXPath("//b[contains(text(),'PIM')]").click();
	}

	@When("^Click Search$")
	public void click_Search() throws Throwable {
		driver.findElementByXPath("//input[@id='searchBtn']").click();
	}

	@Then("^Click Leave$")
	public void click_Leave() throws Throwable {
		driver.findElementByXPath("//b[contains(text(),'PIM')]").click();
	}

	@Then("^Click on Search$")
	public void click_on_Search() throws Throwable {
		driver.findElementByXPath("//input[@id='btnSearch']").click();
	}
}
