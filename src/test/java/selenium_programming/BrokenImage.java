package selenium_programming;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println("All Images :"+images.size());
		
		for (WebElement image : images) 
		{
			
		String img = image.getDomAttribute("src");
		
		if (img == null || img.isEmpty()) {
		    System.out.println("Image src is empty or null");
		    continue;
		}
			
			try 
			{
	
				URL u = new URL(img);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();
				con.connect();
				
				if(con.getResponseCode()>=400)
				{
				     System.out.println(img+"==========>"+"BrokenImage"+con.getResponseCode()+"  "+con.getResponseMessage());
				}
				else
				{
				     System.out.println(img+"==========>"+"Not BrokenImage"+con.getResponseCode()+"  "+con.getResponseMessage());
				}
			} 
			catch (Exception e) 
			{
				
			}
		}
	
	
	
	
	}

}
