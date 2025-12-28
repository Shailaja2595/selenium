package open_new_window;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab_Window
{

	public static void main(String[] args)
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        //Open URL
		driver.get("https://www.google.com/");
		System.out.println("First Page :  "+driver.getTitle());
		
		//Open New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Second Page :  "+driver.getTitle());
		
		
		// get window handles of open window
	     Set<String> windowHandles = driver.getWindowHandles();
	
	     ArrayList<String> handles = new ArrayList<String>();
	    handles.addAll(windowHandles);
		
//	    driver.close();
	    
	    driver.switchTo().window(handles.get(0));    // switch to google page
	    System.out.println("First Page :  "+driver.getTitle());
	}

}
