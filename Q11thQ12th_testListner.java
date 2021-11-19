package SeleniumAssignment;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(SeleniumAssignment.listener_implementation.class)
public class Q11thQ12th_testListner extends Base {
	@Test(retryAnalyzer = retrying_setup.class)
	public void TestListener1() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnXXXXXXLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
		//Find the table
		//WebElement elementTable = driver.findElementById(null)
	}
	
	@Test
	public void TestListener2() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
		
	}
}



