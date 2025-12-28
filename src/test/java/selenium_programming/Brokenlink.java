package selenium_programming;
import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import java.net.URLConnection;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class Brokenlink
{

	public static void main(String[] args) throws IOException , MalformedURLException
	{
		         WebDriver driver=new ChromeDriver();
		         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		      	 
		   //   List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		         
		         //footer section all links
                WebElement links1 = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
                List<WebElement> links = links1.findElements(By.tagName("a"));
		      
		      SoftAssert a =new SoftAssert();
   
		      for(WebElement link : links)

		      {
		          String url= link.getDomAttribute("href");
	          
		          
		          try {
		        	  URL ul=new URL(url);
			          HttpURLConnection conn= (HttpURLConnection)ul.openConnection();
			          conn.connect();
		        	  
		        	  if(conn.getResponseCode()>=400) {
			        	  
			        	  System.out.println(ul+"----->"+conn.getResponseMessage());
			          }
			          else {
			        	  System.out.println(ul+"----->"+conn.getResponseMessage());
			          }
				} catch (MalformedURLException e) {
					System.out.println("MalformedURLException ");
				}
		          
		          
		          
		          
//		          if(conn.getResponseCode()>400) {
//		        	  
//		        	  System.out.println(ul+"----->"+conn.getResponseMessage());
//		          }
//		          else {
//		        	  System.out.println(ul+"----->"+conn.getResponseMessage());
//		          }

//		          int respCode = conn.getResponseCode();
//
//		          System.out.println(respCode);
//
//		          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

		      }

		  //    a.assertAll();
	}

}
