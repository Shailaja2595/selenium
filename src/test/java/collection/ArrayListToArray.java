package collection;
import java.util.*;

public class ArrayListToArray 

{	
	
	    public static void main(String[] args) 
	    {
	        List<String> list = new ArrayList<>();
	        
	        list.add("Java");
	        list.add("Selenium");
	        list.add("Cucumber");

	        // Convert ArrayList → Array
	        String[] arr = list.toArray(new String[0]);

	        // Print array
	        for (String s : arr) {
	            System.out.println(s);
	        }
	    }
	


}
