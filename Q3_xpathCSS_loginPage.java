package SeleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_xpathCSS_loginPage {

	public static void main(String[] args) throws InterruptedException  {
		
		By Imgage_logo= By.xpath("//div[@id='divLogo']/img");

        By Imgage_logo_css=By.cssSelector("div#divLogo img");

        By Imgage_Link= By.xpath("//div[@id='footer']//div[2]//a[1]");

        By Imgage_Link_css =By.cssSelector("div#footer div:nth-child(2) a:nth-child(1)");

        By Imgage_fb= By.xpath("//div[@id='footer']//div[2]//a[2]");

        By Imgage_fb_css=By.cssSelector("div#footer div:nth-child(2) a:nth-child(2)");

        By Imgage_Tweet= By.xpath("//div[@id='footer']//div[2]//a[3]");

        By Imgage_Tweet_css =By.cssSelector("div#footer div:nth-child(4) a:nth-child(3)");

        By Imgage_Youtube= By.xpath("//div[@id='footer']//div[2]//a[4]");

        By Imgage_Youtube_css =By.cssSelector("div#footer div:nth-child(5) a:nth-child(4)");
        
        By txtbx_username = By.xpath("//input[@id='txtUsername']");

        By txtbx_password = By.xpath("//input[@id='txtPassword']");

        By txtbx_username_css = By.cssSelector("input#txtUsername");

        By txtbx_password_css = By.cssSelector("input#txtPassword");
        
        By hreff_resetPassword= By.xpath("//div [@id='forgotPasswordLink']/a");

        By hreff_resetPassword_css= By.cssSelector("div#forgotPasswordLink");

        By hreff_OrangeHRM= By.xpath("//div [@id='footer']/div[1]/a");

        By hreff_OrangeHRM_css= By.cssSelector("div#footer div:nth-child(1) a");
        
        System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.quit();

	}

}
