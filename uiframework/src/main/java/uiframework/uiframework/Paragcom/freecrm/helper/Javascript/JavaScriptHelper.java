package uiframework.uiframework.Paragcom.freecrm.helper.Javascript;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class JavaScriptHelper 
{
private WebDriver driver;
	
	private Logger log = LoggerHelper.getlogger(JavaScriptHelper.class);
	
	public JavaScriptHelper(WebDriver driver)
	{
		this.driver = driver;
		log.info("JavaScriptHelper has been initialised");
	}
	
	/**
	 * This method will execute java script
	 * @param script
	 * @return
	 */
	public Object executeScript(String script)
	{
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		return exe.executeScript(script);
	}
	
	
	
	
	

}
