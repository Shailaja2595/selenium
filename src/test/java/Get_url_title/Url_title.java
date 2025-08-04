package Get_url_title;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_title {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://www.seleniumhq.org");
        
        //URL
      
		String CurrentUrl = driver.getCurrentUrl();
        System.out.println(" Current Url - "+CurrentUrl);
        
      //TITLE
        
        Thread.sleep(5000);
        
	String title = driver.getTitle();
	System.out.println(" title - "+title);
	
	//HTML PAGE SOURCE
	String page_source=driver.getPageSource();
	System.out.println("page_source - "+ page_source);
	driver.quit();
	}

}
