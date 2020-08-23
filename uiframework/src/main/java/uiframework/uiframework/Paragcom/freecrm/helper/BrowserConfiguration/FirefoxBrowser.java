package uiframework.uiframework.Paragcom.freecrm.helper.BrowserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import uiframework.uiframework.Paragcom.freecrm.helper.resource.ResourceHelper;

public class FirefoxBrowser {
	public FirefoxOptions getFirefoxOptions() {

		DesiredCapabilities firefox = DesiredCapabilities.firefox();

		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		
		firefox.setCapability(FirefoxDriver.PROFILE, profile);
		firefox.setCapability("marionette", true);

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			firefoxOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return firefoxOptions;
	}

	public WebDriver getFirefoxDriver(FirefoxOptions firefoxOptions) {

		if (System.getProperty("os.name").contains("Mac"))
		{
			System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("src/main/resources/drivers/geckodriver"));
			return new FirefoxDriver();
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\drivers\\geckodriver.exe");
			return new FirefoxDriver();
		} else if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			return new FirefoxDriver();
		}
		return null;
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\drivers\\geckodriver.exe");
		FirefoxBrowser obj = new FirefoxBrowser();
		WebDriver driver = obj.getFirefoxDriver(obj.getFirefoxOptions());
		driver.get("https://www.zomato.com/bangalore/punjabi-nawabi-hsr/order/LoqDdXx");
	}

	
	
	

}
