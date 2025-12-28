package Automation_project;

import java.awt.Dimension;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_programs
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //fill the information
        
        driver.findElement(By.id("name")).sendKeys("shailaja");
        driver.findElement(By.id("email")).sendKeys("shaialaja2595@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("7972924608");
        driver.findElement(By.id("textarea")).sendKeys("pune");
        
        System.out.println("************************");
        
        //radio button
        
        driver.findElement(By.id("female")).click();
        
        System.out.println("************************");
        
        //checkbox
        
      List<WebElement> chechboxList = driver.findElements(By.xpath("//div[@class='form-group'][4]//div"));
      System.out.println("size of checkbox = "+chechboxList.size());
      
      for(WebElement checkbox : chechboxList)
      {
    	  
    	  String actual = checkbox.getText();
    	  
    	  if(!actual.equals("Saturday"))
    	  {
    		  Thread.sleep(3000);
    		  
    		  checkbox.click();
    	  }
    	  
    	 Thread.sleep(1000);
    	 
    	 }
      
      System.out.println("************************");
      
       // dropdown
      
    WebElement dropdown = driver.findElement(By.id("country"));
      
      Select s= new Select(dropdown);
      List<WebElement> size_dropdown = s.getOptions();

      System.out.println("size of dropdown = "+size_dropdown.size());
     
      s.selectByIndex(6);
      
      System.out.println("************");
      for(WebElement dd : size_dropdown)
      {
    	 String dropdown_list = dd.getText();
    	 System.out.println(dropdown_list);
      }
      
      System.out.println("************************");
      
      // Static Web Table
      
      int row = driver.findElements(By.xpath("(//div[@class='widget-content'])[3]//tr")).size();
      
      int clm = driver.findElements(By.xpath("(//div[@class='widget-content'])[3]//th")).size();
      for(int i =1;i<row;i++)
      {
    	  for(int j=1;j<=clm;j++)
    	  {
    		  String output = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
    	
           if(output.equals("JAVA")) 
           {
        	   
	       System.out.println("Rows :"+i+"  Clm :"+j);
	       
	        break;
	        
           }

    	  }
      }
     
      System.out.println("************************");
      
            // Dynamic Web Table
        
           List<WebElement> td = driver.findElements(By.xpath("//tbody[@id='rows']//tr"));
        
         for (WebElement w : td) {
			List<WebElement> cells = w.findElements(By.tagName("td"));
									
					if(cells.size()>0) {
						String processName =	cells.get(0).getText();
						String CPU  =	cells.get(1).getText();
						String Network =	cells.get(2).getText();
						String Disk =	cells.get(3).getText();
						String Memory =	cells.get(4).getText();
						System.out.println(processName);					
				
						switch (processName) {
						case "Chrome":
							System.out.println("Memory Size of Chromeprocess"+Memory);
							System.out.println("CPU  Size of Chromeprocess"+CPU );
							System.out.println("Network  Size of Chromeprocess"+Network);
							System.out.println("Disk  Size of Chromeprocess"+Disk);
							break;
						case "Firefox":
							System.out.println("Memory Size of Firefoxprocess"+Memory);
							System.out.println("CPU  Size of Firefoxprocess"+CPU );
							System.out.println("Network  Size of Firefoxprocess"+Network);
							System.out.println("Disk  Size of Firefoxprocess"+Disk);
							break;
						default:
							break;
						}			
					}					
		}
           
         System.out.println("************************");
      
      // Pagination Web Table
      
      
     List<WebElement> v = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]//input"));
     
      for (WebElement x : v) {
    	  
    	  x.click();
		
	}
      
      driver.findElement(By.linkText("2")).click();
      
      List<WebElement> v1 = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]//input"));
      
      for (WebElement x1 : v1) {
    	  
    	  x1.click();
		
	}
      System.out.println("************************");
      
      //Auto suggestion
      WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
      search.sendKeys("selenium",Keys.ENTER);
      Thread.sleep(4000);
      
   List<WebElement> Auto_List = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//div"));
   
   System.out.println(Auto_List.size());
 
   for (WebElement u : Auto_List) 
   {
	  String text = u.getText();
	  System.out.println(text);
	  	  if(text.equalsIgnoreCase("Selenium in biology")) {
	  u.click();
	  break;
	  }
	   
   }
   System.out.println("************************");
   
        // Alerts & Popups
         
         driver.findElement(By.id("alertBtn")).click();
        Alert simple_alert = driver.switchTo().alert();
        System.out.println(simple_alert.getText());
        simple_alert.accept();
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("confirmBtn")).click();
      Alert confirmation_alert = driver.switchTo().alert();
      System.out.println(confirmation_alert.getText());
      confirmation_alert.dismiss();
      
        Thread.sleep(2000);
        
         driver.findElement(By.id("promptBtn")).click();
         Alert prompt_alert = driver.switchTo().alert();
         System.out.println( prompt_alert.getText());
         Thread.sleep(2000);
         prompt_alert.sendKeys("shailaja");
         
         prompt_alert.accept();
         
      // Print result shown on the page
         String result = driver.findElement(By.id("demo")).getText();
         System.out.println("Result: " + result);
        
       System.out.println(" Alert handled ");
        
       System.out.println("************************");
       
       //NEW TAB
       
   driver.findElement(By.xpath("//button[text()='New Tab']")).click();
       
   //popup windows
       
        String parent = driver.getWindowHandle();
       System.out.println("parent window = "+parent);
  
       driver.findElement(By.id("PopUp")).click();
       
    Set<String> total_windows = driver.getWindowHandles();
    System.out.println("total windows = "+total_windows);
    
    int windowCount = total_windows.size();
    System.out.println("Total number of open windows: " + windowCount);
    
    System.out.println("*****");
    
    for(String w:total_windows)
    {
    	if(!w.equalsIgnoreCase(parent))
    {
    		driver.switchTo().window(w);
    	
		String title = driver.getTitle();
		System.out.println("child title = "+ title);
		driver.close();
    }
    }
    driver.switchTo().window(parent);
    System.out.println("Parent Title ="+driver.getTitle());
  
    System.out.println("************************");
    
        // Mouse Hover
        
       Actions ac=new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']"))).build().perform();
        
      driver.findElement(By.xpath("//a[text()='Laptops']")).click();
      
      System.out.println("laptop is selectes");
        
      System.out.println("************************");
      
        // Keyboard function
        
     WebElement field1= driver.findElement(By.id("field1"));
     
     field1.sendKeys(Keys.CONTROL+"a");
     field1.sendKeys(Keys.CONTROL+"c");
    
    WebElement field2= driver.findElement(By.id("field2"));
    field2.sendKeys(Keys.CONTROL+"v");
    
    System.out.println("double click action performed");
    
    System.out.println("************************");
    
    // Double Click
  
  
    Actions abc=new Actions(driver);
    WebElement copy_text = driver.findElement(By.xpath(" //button[text()='Copy Text']"));
    Thread.sleep(3000);
    abc.doubleClick(copy_text).build().perform();
    
    WebElement field3= driver.findElement(By.id("field1"));
    WebElement field4= driver.findElement(By.id("field2"));
    
    System.out.println("text field =" + field3);
    System.out.println("text field =" + field4);
    
    System.out.println("************************");
    
    //Drag and Drop
      
        
   WebElement source = driver.findElement(By.id("draggable"));
   WebElement target =   driver.findElement(By.id("droppable"));
    
   Actions x =new Actions(driver);
   x.clickAndHold(source).moveToElement(target).build().perform();
  
   // Verify result (optional)
   
   String droppedText = target.getText();
   System.out.println(droppedText);
   if (droppedText.equalsIgnoreCase("Drop here"))
   {
       System.out.println("Test Passed: Element dropped successfully.");
   } 
   else 
   {
       System.out.println("Test Failed: Element not dropped.");
   }
   
   System.out.println("************************");

        // Slider
        WebElement leftSlider = driver.findElement(By.xpath("//span[@tabindex='0'][1]"));   // Left handle
        WebElement rightSlider = driver.findElement(By.xpath("//span[@tabindex='0'][2]"));  // Right handle

        Actions action = new Actions(driver);

        // Move left handle to increase minimum price (e.g., to $185)
        action.dragAndDropBy(leftSlider, 150, 0).perform(); // Adjust x-offset as needed
        Thread.sleep(1000);

        // Move right handle to decrease maximum price (e.g., to $300)
        action.dragAndDropBy(rightSlider,-20, 0).perform(); // Adjust x-offset as needed
        Thread.sleep(3000);

        // Optional: verify price values if visible in a label
        WebElement amount = driver.findElement(By.id("amount"));
        System.out.println("Selected Range: " + amount.getText());

        System.out.println("************************");

        //SVG Elements
        
        WebElement circle = driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle' ]"));
        String fillColor = circle.getDomAttribute("fill");
        System.out.println("Circle fill color: " + fillColor);

        System.out.println("************************");
        
       // Scrolling DropDown
        
        driver.findElement(By.id("comboBox")).click();
        Thread.sleep(1000); // Wait for dropdown to appear

     // Scroll dropdown container using JS
     WebElement dropdownPanel = driver.findElement(By.id("dropdown")) ;// container with scrollbar

     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", dropdownPanel);

     // Wait and click desired option
     List<WebElement> options = driver.findElements(By.xpath("//div[@class='option']"));

     for (WebElement option : options) {
         if (option.getText().equalsIgnoreCase("Item 62")) 
         {
        	  System.out.println( option.getText());
        	 
        	 option.click();
           
             
             break;
         }
    }
     
     
     System.out.println("** THE END **");
     
     
	}    
	

}
