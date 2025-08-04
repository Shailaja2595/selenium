package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider 
 {
	public static  WebDriver driver;
	
	
   @DataProvider//(name="data1")
   public Object[][] testcase1()
       {
	   Object data[][]=new Object[3][2];
	   
	   data[0][0]="shailaja2595@gmail.com";
	   data[0][1]="123456";
	   
	   data[1][0]="shailaja@gmail.com";
	   data[1][1]="shailaja@25";
	   
	   data[2][0]="shailaja2595@gmail.com";
	   data[2][1]="shailaja@25";
	   
	   return data;
	   
	   }
   @Test(dataProvider="testcase1")
   public void testcase2( String user,String pass) throws InterruptedException
      {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	   
	   WebElement email = driver.findElement(By.id("usernameField"));
	   Thread.sleep(3000);
	   email.sendKeys(user);
	   
	   WebElement password= driver.findElement(By.id("passwordField"));
	   Thread.sleep(3000);
	   password.sendKeys(pass);
	   
	   driver.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
	   Thread.sleep(3000);
	   String v = driver.findElement(By.xpath("//div[@title='Shailaja  Khandekar']")).getText();
	   System.out.println(v);
	   Thread.sleep(3000);
	 //  driver.quit();
	   
      }
   
   
  
   @Test( dataProviderClass =Exceldata.class,dataProvider="testdata" )
   public void callExceldata( String user,String pass) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(3000);
		driver.findElement((By.xpath("(//input[@type='text'])[1]"))).sendKeys(user);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
   }
   
   
 }
