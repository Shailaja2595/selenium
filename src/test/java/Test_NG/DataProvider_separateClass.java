package Test_NG;

import org.testng.annotations.Test;

public class DataProvider_separateClass
{

	@Test(dataProvider="dp2" , dataProviderClass=DataSupplier.class)
	
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
}
