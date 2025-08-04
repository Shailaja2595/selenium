package Test_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_indices 
{
      @DataProvider (indices= {0,2})
      public String[] test1()
      {
    	  String [] data=new String []
    			  {
    					  "shailaja",
    					  "khandeakar",
    					  "subhash",
    					  "hogale"
    			  };
    	  
    	  return data;
      }
      
      
      @Test(dataProvider="test1")
      
      public void test2(String s)
      {
    	  System.out.println(s);
      }
      
      
}
