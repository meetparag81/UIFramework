package uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uiframework.uiframework.Paragcom.freecrm.helper.resource.ResourceHelper;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.setProperty("webdriver.chrome.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\drivers");
		//System.setProperty("webdriver.chrome.driver" ,"G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\for 65\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
	}

}
