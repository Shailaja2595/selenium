package extentReport123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Screenshot
{
      static 	WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		ExtentReports ex=new ExtentReports();
		ExtentSparkReporter sp=new ExtentSparkReporter("./target/Extent_screenshot/sc.html");
		ex.attachReporter(sp);
		
		//browser code
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String v = captureScreenshot();
		
		ex.createTest(" Screenshot Test 1 " , " This is for attaching the screenshot to the test at test level").info(" This is a info msg ").addScreenCaptureFromPath(v,"Google Homepage");
		
		ex.createTest(" Screenshot Test 2 " , " This is for attaching the screenshot to the test at test level").info(" This is a info msg ").
		addScreenCaptureFromPath(v).
		addScreenCaptureFromPath(v,"Google Homepage1").
		addScreenCaptureFromPath(v,"Google Homepage2").
		addScreenCaptureFromPath(v,"Google Homepage3").
		addScreenCaptureFromPath(v,"Google Homepage4");
		
		ex.createTest(" Screenshot Test 3 " , " This is for attaching the screenshot to the test at test level").info(" This is a info msg ").addScreenCaptureFromPath(v);
		
		ex.createTest(" Screenshot Test 4 " , " This is for attaching the screenshot to the test at test level").info(" This is a info msg ").
		addScreenCaptureFromPath(v,"Google Homepage").
		addScreenCaptureFromPath(v,"Google Homepage").
		addScreenCaptureFromPath(v,"Google Homepage").
		addScreenCaptureFromPath(v,"Google Homepage");
		
		
		ex.flush();
		
		driver.quit();
	}
	
	public static String captureScreenshot() throws IOException
	{
				File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File des=new File("./target/subhash.png");
				 FileHandler.copy(sc, des);
				 
				 System.out.println(" Screenshot saved successfully");
				return des.getAbsolutePath();
				
	}

} 
