package Automation_project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement MenMenu = driver.findElement(By.xpath("//a[text()='Men']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(MenMenu).perform();
	
	
	//Enable debugger to pause the web page
	
   // setTimeout(()=>{debugger;},5000) use this code in source
	
	driver.findElement(By.xpath("//a[text()='Sweatshirts']")).click();
	
	driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
	
	String window2 = new ArrayList<String>(driver.getWindowHandles()).get(1);
    driver.switchTo().window(window2);
    
   String ProductTitle = driver.findElement(By.xpath("//h1[text()='UNSTD']")).getText();
   System.out.println(ProductTitle);
    
   String ProductName = driver.findElement(By.xpath("//h1[text()='Men Plus Size Cotton Sweatshirt']")).getText();
   System.out.println(ProductName);
 
   String ProductPrice = driver.findElement(By.xpath("//strong[text()='₹1395']")).getText();
  // System.out.println(ProductPrice);
   
   ProductPrice= ProductPrice.replaceAll("[^0-9]", "");
   System.out.println(ProductPrice);
   
   List<WebElement> Button_size = driver.findElements(By.xpath("//p[@class='size-buttons-unified-size']"));
   
   String ProductSize="";
   
   for (WebElement b : Button_size) 
   {
	   b.click();
	   ProductSize=  b.getText();
	   break;
   }

   System.out.println(ProductSize);
   
    driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
    driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
   
   //Cart validation
    
    String Cart_ProductTitle = driver.findElement(By.xpath("//div[text()='UNSTD']")).getText();
   // System.out.println(Cart_ProductTitle);
    
    if(Cart_ProductTitle.contains(ProductTitle))
    {
    	System.out.println("Product title information is matching , Test Passed");
    }
     
    String Cart_ProductName = driver.findElement(By.xpath("//a[text()='Men Plus Size Cotton Sweatshirt']")).getText();
  //  System.out.println(Cart_ProductName);
  
    if(Cart_ProductName.contains(ProductName)) 
    {
    	System.out.println("Product Name information is matching , Test Passed");
    }
    
    String Cart_ProductSize = driver.findElement(By.className("itemComponents-base-size")).getText();
 //   System.out.println(Cart_ProductSize);
    
    Cart_ProductSize= Cart_ProductSize.replaceAll("Size: ", "");
  //  System.out.println(Cart_ProductPrice);
    
    if(Cart_ProductSize.contentEquals(ProductSize))
    {
    	System.out.println("Product Size information is matching , Test Passed");
    }
   
    String Cart_ProductQuantity = driver.findElement(By.className("itemComponents-base-quantity")).getText();
  //  System.out.println(Cart_ProductQuantity);
    
    Cart_ProductQuantity= Cart_ProductQuantity.replaceAll("Qty: ", "");
  //  System.out.println(Cart_ProductQuantity);
    
   if(Cart_ProductQuantity.contentEquals("1"))
   {
	   System.out.println("Product Quantity information is matching , Test Passed");   
   }
    
    String Cart_ProductPrice = driver.findElement(By.className("itemComponents-base-price")).getText();
    System.out.println(Cart_ProductPrice);
    
    Cart_ProductPrice= ProductPrice.replaceAll("[^0-9]", "");
    System.out.println(Cart_ProductPrice);
    
   
   
   
   
   
	}

}
