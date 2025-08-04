package extentReport123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentss {

	static ExtentSparkReporter spartReport;
	static ExtentReports extentreport;
	
	@BeforeTest
	public void browser() {
         WebDriver driver=new ChromeDriver();
		
		 spartReport=new ExtentSparkReporter("./target/report/shaila.html");
		 spartReport.config().setReportName("shailaja");
		 spartReport.config().setDocumentTitle("khandekar");
		 spartReport.config().setTheme(Theme.DARK);
		 extentreport=new ExtentReports();
		
		extentreport.attachReporter(spartReport);
		
		driver.get("https://www.youtube.com/watch?v=W9ekdTm65Jc");
		
	}
	
	@Test
	public void test1() {
		ExtentTest v = extentreport.createTest("repoetName1");
		
		System.out.println("hi");
		
		v.pass("completed");
		v.info("test completed");
		extentreport.flush();
	}
	@Test
	public void test2() {
		extentreport.createTest("repoetName12");
		
		System.out.println("hi");
		extentreport.flush();
	}
		
		



}
