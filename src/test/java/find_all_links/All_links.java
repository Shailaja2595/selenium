package find_all_links;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
        
		// All links on the Page
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println( links );
		
		// All the links in footer section
	      WebElement footer = driver.findElement(By.id("gf-BIG"));
         List<WebElement> footer_link = footer.findElements(By.tagName("a"));
         int size = footer_link.size();
          System.out.println(size);
          
          
          // All the footer section column link
         WebElement clm_footer = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
         List<WebElement> clm_size = clm_footer.findElements(By.tagName("a"));
         int size1 = clm_size.size();
         System.out.println(size1);
          
          // Open on each link in footer section  
          for(WebElement link :clm_size)
          {
        String open_tab = Keys.chord(Keys.CONTROL , Keys.ENTER);
        link.sendKeys( open_tab);
          }
          
       Set<String> All_window = driver.getWindowHandles();
      Iterator<String> it = All_window.iterator();
      
      while(it.hasNext())
      {
    	
    	  driver.switchTo().window(it.next());
    	
    	  System.out.println( driver.getTitle());
      }       
	}

}
