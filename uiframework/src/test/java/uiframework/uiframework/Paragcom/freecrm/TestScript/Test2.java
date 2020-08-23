package uiframework.uiframework.Paragcom.freecrm.TestScript;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import uiframework.uiframework.Paragcom.TestBase.TestBase;
import uiframework.uiframework.Paragcom.freecrm.helper.Aseertion.AssertHelper;

public class Test2 extends TestBase 
{
	

	 Test2() 
	 {
		super();
		
	}

	public void testLogin()
	{
		AssertHelper.markPass();
	}
	
	@Test
	public void testLogin4()
	{
		AssertHelper.markFail();
	}
	
	@Test
	public void testLogin5()
	{
		AssertHelper.markPass();
	}
	
	@Test
	public void testLogin6()
	{
		AssertHelper.markFail();

}
}
