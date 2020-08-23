package uiframework.uiframework.Paragcom.freecrm.helper.Frame;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class FrameHelper 
{
	private Logger log= LoggerHelper.getlogger(FrameHelper.class);
	private WebDriver driver;
	
	
	FrameHelper(WebDriver driver)
	{
		this.driver = driver;
	}
	/**
	 * this method will identify no of frames
	 */
	
	public int NoofFrames()
	{
		int size=driver.findElements(By.xpath("//iframe")).size();
		return size; 
		
	}
	
	/**
	 * this method will switchToFrame based on frame index
	 * @param frameIndex
	 */
	public void switchToFrame(int frameIndex){
		driver.switchTo().frame(frameIndex);
		log.info("switched to :"+ frameIndex+" frame");
	}
	
	/**
	 * this method will switchToFrame based on frame name
	 * @param frameName
	 */
	public void switchToFrame(String frameName){
		driver.switchTo().frame(frameName);
		log.info("switched to :"+ frameName+" frame");
	}
	
	/**
	 * this method will switchToFrame based on frame WebElement
	 * @param element
	 */
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
		log.info("switched to frame "+element.toString());
	}
}



