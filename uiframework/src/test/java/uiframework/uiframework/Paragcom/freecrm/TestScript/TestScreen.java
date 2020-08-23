package uiframework.uiframework.Paragcom.freecrm.TestScript;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uiframework.uiframework.Paragcom.TestBase.TestBase;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class TestScreen extends TestBase
{
	public TestScreen()
	{
		super();
	}
	
	
	Logger log= LoggerHelper.getlogger(TestBase.class);
	
	@ Test
	public void TestscreenTest() throws Exception
	{
		driver.get("https://www.seleniumhq.org/download/");
		//Capturescreen("firstscreen");
		//getScreenshot(driver, "firstscreenshot");
		Capturescreen("second");
		log.info("Screenshot is saved");
		
	}

}
