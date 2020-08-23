package uiframework.uiframework.Paragcom.Pageobjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uiframework.uiframework.Paragcom.freecrm.helper.Actions.ActionsHelper;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class HomePage 
{
	@FindBy (xpath="//span[@id='customHeaderModulePickerBtn-img']") WebElement Homedropdown;
	
	private  Logger log = LoggerHelper.getlogger(HomePage.class);
			private WebDriver driver;
			ActionsHelper act;
	public  HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new ActionsHelper(driver);
	}
	
	public List Homeoptions()
	{
		act.MovetoElement(Homedropdown).click();
		List<WebElement> homeoptions = driver.findElements((By.xpath("")));
		return homeoptions;
		
	}
	

}
