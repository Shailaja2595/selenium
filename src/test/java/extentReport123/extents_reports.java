package extentReport123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extents_reports {
	static ExtentSparkReporter spartReport;
	static ExtentReports extentreport;
	
	@BeforeTest
	public void browser() 
	{
         WebDriver driver=new ChromeDriver();
		
		 spartReport=new ExtentSparkReporter("./target/report/shaila.html");
		 extentreport=new ExtentReports();
		
		extentreport.attachReporter(spartReport);
	
		driver.get("https://www.youtube.com/watch?v=W9ekdTm65Jc");		
	}
	
	@Test
	public void test1() {
		extentreport.createTest("subhash");
		
		System.out.println("hi");
		extentreport.flush();
	}
	@Test
	public void test2() {
		extentreport.createTest("shailaja1").assignAuthor("Shailaja").assignCategory("Smoke").assignDevice("Chrome 139");
	
		System.out.println("hi");
		extentreport.flush();
	}
		
		


}
