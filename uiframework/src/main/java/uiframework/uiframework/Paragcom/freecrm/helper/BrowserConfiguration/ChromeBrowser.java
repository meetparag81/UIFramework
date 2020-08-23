package uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import uiframework.uiframework.Paragcom.freecrm.helper.resource.ResourceHelper;

public class ChromeBrowser 
{

	public ChromeOptions getChromeOption()
	{
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--test-type");
		//option.addArguments("--disable-popup-blocking");

		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);	
		
		// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			option.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}

		return option;

	}

	public WebDriver getChromeDriver(ChromeOptions cap) 
	{

		if (System.getProperty("os.name").contains("Mac")) 
		{
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
			return new ChromeDriver(cap);
		} 
		else if (System.getProperty("os.name").contains("Window")) 
		{
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
			return new ChromeDriver(cap);
		} 
		else if (System.getProperty("os.name").contains("Linux"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chrome");
			return new ChromeDriver(cap);
		}
		return null;

	}
	
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver",ResourceHelper.getResourcePath("/src/main/resources/chromedriver.exe"));
		System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		ChromeBrowser obj = new ChromeBrowser();
		WebDriver driver = obj.getChromeDriver( obj.getChromeOption());
		driver.get("https://www.zomato.com/bangalore/punjabi-nawabi-hsr/order/LoqDdXx");
		
	}
}
