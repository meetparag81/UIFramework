package uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration.config;

import uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration.BrowserType;

public interface ConfigReader 
{
	
	public int getImplicitWait();
	public int getexplicitWait();
	public int getPageLoadTimeout();
	public BrowserType getBrowserType();

}
