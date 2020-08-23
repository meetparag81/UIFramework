package uiframework.uiframework.Paragcom.freecrm.TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import uiframework.uiframework.Paragcom.TestBase.TestBase;
import uiframework.uiframework.Paragcom.freecrm.helper.Aseertion.AssertHelper;

public class Report  
{
	

	@Test
	public void Login()
	{
		AssertHelper.markPass();
	}
	
	@Test
	public void Login1()
	{
		AssertHelper.markFail();
	}
	
	@Test
	public void Login2()
	{
		AssertHelper.markPass();
	}
	
	@Test
	public void Login3()
	{
		AssertHelper.markFail();
	}

}
