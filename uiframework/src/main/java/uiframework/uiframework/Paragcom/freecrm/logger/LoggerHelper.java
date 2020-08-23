package uiframework.uiframework.Paragcom.freecrm.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import uiframework.uiframework.Paragcom.freecrm.helper.resource.ResourceHelper;

public class LoggerHelper 
{
		
	private static  boolean root= false;
			
			public static Logger getlogger(Class cls)
			{
				
		if(root)
		{
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("\\src\\main\\resorces\\configfile\\log4j.properties"));
		root = true;
		return Logger.getLogger(cls);
		
			}
			
			public static void main(String[] args) 
			{
			Logger log = LoggerHelper.getlogger(LoggerHelper.class);
			log.info("loggers is configured");
			log.info("loggers is configured");
			log.info("loggers is configured");
			}
	

}
