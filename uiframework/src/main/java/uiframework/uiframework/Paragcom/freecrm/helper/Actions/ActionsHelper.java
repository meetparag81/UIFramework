package uiframework.uiframework.Paragcom.freecrm.helper.Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import uiframework.uiframework.Paragcom.freecrm.helper.Select.DropdownHelper;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class ActionsHelper 
{
	
	private Logger log = LoggerHelper.getlogger(ActionsHelper.class);
	 private   WebDriver driver;
	 
	 public ActionsHelper(WebDriver driver) 
	 {
		 this.driver = driver;
	 
	 }
	 
	public Actions MovetoElement(WebElement element)
	{
		Actions act = new Actions(driver);
		return act.moveToElement(element); 
		
	}
	

}
