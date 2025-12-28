package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile 
{
	Properties pr ;
	String path ="C:\\New project shailaja\\selenium_program\\src\\test\\java\\PropertiesFileDemo\\Config.properties";
	
	
	
	public ReadConfigFile() throws IOException
	{
		pr = new Properties();
		
		FileInputStream fs = new FileInputStream(path);
		
		pr.load(fs);
	}
	

	public String getURL()
	{
	String url=	pr.getProperty("url");
		if (url!=null)
		{
			return url;
		}
			else
			{
				throw new RuntimeException("url not specified in config file ");
		    }
	}
	public String getPassword()
	{
	String password=	pr.getProperty("password");
		if (password!=null)
		{
			return password;
		}
			else
			{
				throw new RuntimeException("password not specified in config file ");
			
		}
	}
	
	public String getUserName()
	{
	String username = pr.getProperty("username");
		if (username!=null)
		
			return username;
			else
				throw new RuntimeException("username not specified in config file ");
		
	}
}
