package SeleniumAssignment;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class listner_implementation extends Base implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test success..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotPass").save();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed..." + result.getMethod());
		Shutterbug.shootPage(Base.driver).withName("automationtestingscreenshotFail").save();
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
