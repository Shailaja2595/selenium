package Test_NG;

import org.testng.annotations.Test;

public class Grouping_concept {

	@Test(groups={"smoke"})
	public void test1()
	{
         System.out.println("shailaja");
	}
	@Test(groups={"sanity","smoke"})
	public void test2()
	{
		 System.out.println("subhash  & shailaja");
	}
	@Test(groups={"retesting"})
	public void test3() 
	{
		 System.out.println("khandekar");
	}
	@Test(groups={"regrassion"})
	public void test4() 
	{
		 System.out.println("hogale & subhash & shailaja");

	}

}
