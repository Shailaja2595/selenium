package Automation_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Exercise {

	public static void main(String[] args) {
	
		 WebDriver driver = new ChromeDriver();
         driver.get("https://automationexercise.com/login");
       
         //Test Case 1: Register User
         driver.findElement(By.name("name")).sendKeys("shailaja khandekar");
         driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("shailaja2595@gmail.com");
         driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
         
         //Enter Account Information
         driver.findElement(By.id("id_gender2")).click();
         driver.findElement(By.id("password")).sendKeys("Shailaja@2595");
        WebElement day = driver.findElement(By.id("days"));
      
        Select s1= new Select(day);
        s1.selectByValue("25");
        
        WebElement months = driver.findElement(By.id("months"));
        Select s2= new Select(months);
        s2.selectByValue("10");
        
        
        WebElement years = driver.findElement(By.id("years"));
        Select s3= new Select(years);
        s3.selectByValue("1994");
        
       WebElement checkbox = driver.findElement(By.id("newsletter"));
        checkbox.click();
        
        System.out.println(checkbox.isSelected());
        
        driver.findElement(By.id("first_name")).sendKeys("shailaja");
        driver.findElement(By.id("last_name")).sendKeys("khandekar");
        driver.findElement(By.id("company")).sendKeys("abc");
        driver.findElement(By.id("address1")).sendKeys("pune");
        
        WebElement dropdown = driver.findElement(By.id("country"));
        Select s= new Select(dropdown);
        s.selectByIndex(3);
     
        driver.findElement(By.id("state")).sendKeys("MAHARASHTRA");
        driver.findElement(By.id("city")).sendKeys("PUNE");
        driver.findElement(By.id("zipcode")).sendKeys("421689");
        driver.findElement(By.id("mobile_number")).sendKeys("3295478126");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("shailaja2595@gmail.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
	}

}
