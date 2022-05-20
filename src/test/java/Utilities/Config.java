package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	Properties pro;
	public Config() throws IOException
	{
		File fi=new File("./Config/config.properties");
		FileInputStream fis= new FileInputStream(fi);
		pro=new Properties();
		pro.load(fis);
		
	}
	public String getDataFromConfig(String keytoSearch) 
	{
		return pro.getProperty(keytoSearch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
    public String getURL()
    {
    	return pro.getProperty("URL");
    }
}
