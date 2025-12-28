package selenium_programming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CooKies 
{

	public static void main(String[] args) 
	{
		
          WebDriver driver=new ChromeDriver();		
		  driver.get("https://www.facebook.com/");	
		  driver.manage().window().maximize();
		  
		//  Get all cookies before adding
	        Set<Cookie> allCookies = driver.manage().getCookies();
	        System.out.println("Initial cookies: " + allCookies.size());

	        //  Add a custom cookie
	        Cookie myCookie = new Cookie("shailaja", "12345");
	        driver.manage().addCookie(myCookie);
	        System.out.println("Cookie added: " + driver.manage().getCookieNamed("shailaja"));

	        //  Verify after adding
	        allCookies = driver.manage().getCookies();
	        System.out.println("Cookies after adding: " + allCookies.size());

	        //  Delete the cookie
	        driver.manage().deleteCookieNamed("shailaja");
	        System.out.println("Cookie deleted.");

	        //  Verify after deleting
	        allCookies = driver.manage().getCookies();
	        System.out.println("Cookies after deleting: " + allCookies.size());

	        //  Print a specific cookie (wd)
	        Cookie wdCookie = driver.manage().getCookieNamed("wd");
	        System.out.println("wd cookie = " + wdCookie);

	        driver.quit();
   
         
	}

}
