package uiframework.uiframework.Paragcom.freecrm.helper.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import uiframework.uiframework.Paragcom.freecrm.logger.LoggerHelper;

public class DataBaseHelper 
{
	private static Logger log = LoggerHelper.getlogger(DataBaseHelper.class);
	private static String url= "jdbc:sqlserver://localhost:1443/TestDB";
	private static String username= "sa";
	private static String password= "pBorprg$81";
	private static Connection connection;
	private static String driverName = "";
	private static DataBaseHelper instance = null;
	
	public DataBaseHelper()
	{
		connection =GetSingleInstanceConnection();
	}
	
	public static DataBaseHelper getInstance()
	{
		if(instance== null)
		{
			instance =  new DataBaseHelper();
		}
		
		return instance;
		
	}
	
	private Connection GetSingleInstanceConnection()
	{
		try {
			Class.forName(driverName);
			try {
				connection = DriverManager.getConnection(url, username, password);
				if (connection != null) 
				{
					log.info("Connected to data base..");
				}
			} 
			catch (Exception e) 
			{
				log.error("Failed to create Data base connection.." + e);

			}
			
		
		}
		catch (ClassNotFoundException e)
		{
			log.info("Diver not found"+ e);
			
		}
{
			
		}
return connection;
	}
	
	public Connection getconnection()
	{
		return connection;
		
	}
}
	
	

