package selenium_programming;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Broken 
{

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		List<WebElement> listlinks = driver.findElements(By.tagName("a"));
		
		int count = listlinks.size();
		System.out.println(count);
		
		int incr=1;
		
		for(WebElement e:listlinks) {
			
			
			String url = e.getDomAttribute("href");
			 if (url == null || url.trim().isEmpty()) {
			        System.out.println("Skipped: href is null or empty");
			        continue;
			    }
			
			try {
				URL ul=new  URL(url);
				
				HttpURLConnection s = (HttpURLConnection)ul.openConnection();
				s.connect();
				
				if(s.getResponseCode()>400) {
					System.out.println(ul+"---"+s.getResponseMessage());
				}
				else {
					System.out.println(incr+":"+ul+"---"+s.getResponseMessage());
					incr++;
				}
				
			} catch (MalformedURLException e1) {
				            System.err.println("MalformedURLException caught for " + " : " + e1.getMessage());

			}
		}	}		

}
