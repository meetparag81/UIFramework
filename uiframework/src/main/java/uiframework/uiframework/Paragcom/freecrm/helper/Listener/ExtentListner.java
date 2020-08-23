package uiframework.uiframework.Paragcom.freecrm.helper.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uiframework.uiframework.Paragcom.Utils.ExtentManager;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class ExtentListner implements ITestListener
{
	private Logger log = LoggerHelper.getlogger(ExtentListner.class);
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public void onStart(ITestContext context)
	{
		extent= ExtentManager.getInstance();
		//test = extent.createTest(context.getName());
		Reporter.log(context.getCurrentXmlTest().getName()+" Class Started..");
		String test = context.getCurrentXmlTest().getName();
				System.out.println("TestName is" + test);
	Reporter.log(context.getCurrentXmlTest().getName()+"test Started..");
		log.info(context.getCurrentXmlTest().getName()+" Class Started..");
		
	}

	public void onTestStart(ITestResult result)
	{
		Reporter.log(result.getMethod().getMethodName()+" Test Started..");
		log.info(result.getMethod().getMethodName()+" Test Started..");
		
	
	}

	public void onTestSuccess(ITestResult result) 
	{
		// extent test variable is used to log test steps onto the generated HTML report
		//test.log(Status.PASS, result.getName() + "test passed..");
		Reporter.log(result.getMethod().getMethodName()+" Test Passed..");
		log.info(result.getMethod().getMethodName()+" Test Passed..");
		
	}

	public void onTestFailure(ITestResult result) 
	{
		//test.log(Status.FAIL, result.getThrowable());
		Reporter.log(result.getMethod().getMethodName()+" Test Failed.."+result.getThrowable());
		log.error(result.getMethod().getMethodName()+" Test Failed.."+result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		// extent test variable is used to log test steps onto the generated HTML report
				test.log(Status.SKIP, result.getThrowable());
				// Reporter is used to register a logs in testNG report.
				Reporter.log(result.getMethod().getMethodName()+"test skipped.."+result.getThrowable() );
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) 
	{
	extent.flush();
		String test = context.getName();
		System.out.println(test);
	Reporter.log(context.getName()+"test finished..");
		
	}

}
