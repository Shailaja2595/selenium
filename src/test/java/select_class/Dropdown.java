package select_class;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	public static void main(String[] args) 
	{
		 WebDriver driver =new ChromeDriver();
         driver.get("https://www.facebook.com/r.php?locale=en_GB");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         
      WebElement day = driver.findElement(By.id("day"));
      Select sel=new Select(day);
      List<WebElement> p = sel.getOptions();
         
      for(WebElement w:p)
      {
    	String e = w.getText();
    	System.out.println(e ); 
      }

     int v = p.size();
     sel.selectByIndex(v-2);
      
    //  sel.selectByIndex(16);
      
      WebElement month = driver.findElement(By.id("month"));
      Select sel1=new Select(month);
      sel1.selectByValue("3");
      
      WebElement year = driver.findElement(By.id("year"));
      Select sel2=new Select(year);
      sel2.selectByVisibleText("1989");
      
      driver.findElement(By.xpath("(//*[@type='radio'])[3]")).click();
      
    
	}
	
	

}
