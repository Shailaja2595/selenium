package extentReport123;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Exceptions 
{

	public static void main(String[] args)
	{
		ExtentSparkReporter sparkReports=new ExtentSparkReporter("./target/Exception/exception .html");
		
		
		ExtentReports extentReports= new ExtentReports();
		
		extentReports.attachReporter(sparkReports);
		
		extentReports.createTest("Test 1").pass(" This is pass ");
		
		extentReports.createTest("Test 2").fail(" This is fail ");

		extentReports.createTest("Test 3").skip(" This is pass ");

		
		try 
		{
			int i=5/0;
		} 
		catch (Exception e) 
		{
		extentReports.createTest("Exception Test1").fail(e);
		}
		
		
		Throwable t=new RuntimeException(" this is a custom exception");
		extentReports.createTest("Exception Test2").fail(t);
		
		extentReports.createTest("Exception Test3").fail(t);
		
		
		extentReports.flush();
		

	}

}
