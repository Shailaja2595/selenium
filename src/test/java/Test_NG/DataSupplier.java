package Test_NG;

import org.testng.annotations.DataProvider;

public class DataSupplier
{    
   
	    @DataProvider
	    public String []dp1()
	    {
	    	String[] data=new String []
	    			{
	    					"shailaja",
	    					"khandekar",
	    					"subhash",
	    					"hogale"
	    			};
	    	return data;
	    }
	
	    @DataProvider
	    public String []dp2()
	    {
	    	String[] data=new String []
	    			{
	    					"101",
	    					"102",
	    					"103",
	    					"104"
	    			};
	    	return data;
	    }
	
	
	
}
