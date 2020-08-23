package uiframework.uiframework.Paragcom.Pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uiframework.uiframework.Paragcom.TestBase.TestBase;
import uiframework.uiframework.Paragcom.freecrm.helper.Actions.ActionsHelper;
import uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration.config.objectreader;
import uiframework.uiframework.Paragcom.freecrm.helper.wait.WaitHelper;
import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class LoginPage {
	
	private WebDriver driver;
	private  Logger log = LoggerHelper.getlogger(LoginPage.class);
	WaitHelper waitHelper;
	ActionsHelper act;
	
	
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//input[@name='login']")WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper= new WaitHelper(driver);
		waitHelper.waitForElement(signin, objectreader.reader.getexplicitWait());
		new TestBase().navigatetoscreen(driver);
		act = new ActionsHelper(driver);
	}
	
	public  void EnterUsername(String name)
	{
		username.sendKeys(name);
	}
	
	public void Enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnSignIn()
	{
		act.MovetoElement(signin).click();
	}
	
	
	public HomePage LogintoAopplication (String username, String password)
	{
		EnterUsername(username);
		Enterpassword(password);
		
		
		return new HomePage(driver);
		
		
		
	}

}
