package collection;

import java.util.*;

public class ArrayToArrayList 
{

	public static void main(String[] args) 
	{

		        String[] arr = {"Java", "Selenium", "TestNG"};

		        // Convert Array → ArrayList
		        List<String> list = new ArrayList<>(Arrays.asList(arr));

		        // Use ArrayList methods
		        list.add("Cucumber");
		        list.remove("TestNG");

		        System.out.println(list); // [Java, Selenium, Cucumber]
		    }
		


	

}
