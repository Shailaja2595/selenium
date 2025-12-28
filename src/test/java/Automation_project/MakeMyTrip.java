package Automation_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();
     driver.get("https://www.makemytrip.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     driver.findElement(By.className("commonModal__close")).click();
     
     //One Way
     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mumbai,");
     driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
     driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
     driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
     driver.findElement(By.xpath("//div[@aria-label='Fri Nov 14 2025']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
   System.out.println(driver.getTitle());
     
     //Round Trip
     
//     driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
//     
//     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("pune,");
//     driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
//     driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
//     driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
//     driver.findElement(By.xpath("//div[@aria-label='Fri Nov 14 2025']")).click();
//     
//     Thread.sleep(3000);
     
// String expected="November2026";
//  
//     while(true) {
//    	   
//    	// System.out.println(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText());
//    	 
//    	// String acutal = driver.findElement(By.xpath("//div[contains(., 'November') and span[text()='2025']]")).getText();
//    	 
//    	 String acutal = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
//    	 
//    	 
//    	 System.out.println(acutal);
//    	    if(acutal.equals(expected)) {
//    	    	  driver.findElement(By.xpath("//div[@aria-label='Thu Nov 12 2026']")).click();
//    	        break; 
//    	    } else {
//    	       
//    	    	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//    	    
//    	    }
//    	}
//     
     

     
	}

}
