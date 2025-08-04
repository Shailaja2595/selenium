package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DesiredCapabilitiessss 
{

	public static void main(String[] args) 
	{

		DesiredCapabilities caps=new  DesiredCapabilities ();
		caps.setAcceptInsecureCerts(true);
	
		ChromeOptions options =new ChromeOptions ();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		options.merge(caps);
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://cacert.com");
		
      


	}

}
