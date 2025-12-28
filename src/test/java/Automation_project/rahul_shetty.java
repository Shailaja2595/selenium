package Automation_project;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahul_shetty
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Radio Button Example
//		driver.findElement(By.xpath("//input[@value='radio2']")).click();
//
//		System.out.println("*********************************");

		// Suggession Class Example

	//	driver.findElement(By.id("autocomplete")).sendKeys("br");
		
//		System.out.println("*********************************");

		// Dropdown Example

//		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//
//		Select s = new Select(dropdown);
//		List<WebElement> list = s.getOptions();
//         	int k = list.size();
//		
//	     s.selectByIndex(k-2);
//		
//		for (WebElement w : list) {
//			
//			System.out.println(w.getText());
//		}
    
//		System.out.println("*********************************");
		
		// Checkbox Example
		
//	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	int size_checkbox = checkbox.size();
//	System.out.println(size_checkbox);
//	
//	for (WebElement box : checkbox) 
//	{
//	String box_list =  box.getDomAttribute("value");
//		
//		System.out.println(box_list);
//		
//		if( ! box_list.equals("option2"))
//		{
//			box.click();
//		}
//		
//	}
	
//		System.out.println("*********************************");
	
	// Switch Window Example
	
		String parent = driver.getWindowHandle();
		System.out.println(" parent:"+parent);
		
		driver.findElement(By.id("openwindow")).click();
		
	Set<String> All_windows = driver.getWindowHandles();
		System.out.println(" All windows :"+All_windows);
//		
//		for (String v : All_windows)
//		{
//			if( ! v.equals(parent))
//			{
//          driver.switchTo().window(v);
//          
//			String title = driver.getTitle();
//			
//			System.out.println(" child_window_title :: "+ title);
//			
//			driver.close();
//			}
//			
//		}
//		
//	 driver.switchTo().window(parent);
//	System.out.println(" back to parent window ::"+driver.getTitle());
//		
//	System.out.println("*********************************");
		
		// Switch Tab Example
		


		
		
		
		
		
		
		
		
	
	}

}
