package extentReport123;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Log_level 
{

	public static void main(String[] args)
	{
	ExtentReports extentReports= new ExtentReports();
	ExtentSparkReporter sparkReports=new ExtentSparkReporter("./target/khandekar.html");
	extentReports.attachReporter(sparkReports);
	
	extentReports.createTest("Test 1").pass(" This is pass ");
	
	extentReports.createTest("Test 2").fail(" This is fail ");

	extentReports.createTest("Test 3").skip(" This is pass ");

	extentReports.createTest("Test 4").warning("This is warning");
	
	extentReports.createTest("Test 5").info("This is info");
	extentReports.flush();
	
	
	//IT HAS SOME PRIORITY
	
	//FAIL
	
	//SKIP
	
	//WARNING
	
	//PASS
	
	//INFO
	
	
	}

}
