package SeleniumAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Q13th_login extends Base{

	@Test
	public void LoginPage() {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		
		driver.findElementByXPath("//b[contains(text(),'PIM')]").click();
		driver.findElementByXPath("//input[@id='empsearch_employee_name_empName']").sendKeys("Linda Anderson");
		driver.findElementByXPath("//input[@id='searchBtn']").click();
		//Find the table
		//WebElement elementTable = driver.findElementById(null)
		String txt = driver.findElementByXPath("//a[contains(text(),'Anderson')]").getText();
		Assert.assertEquals(txt, "Anderson");
		
		Shutterbug.shootPage(driver).withName("AndersonPage").save();
	}
}
