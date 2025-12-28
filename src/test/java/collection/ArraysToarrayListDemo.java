package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToarrayListDemo 
{

	public static void main(String[] args) 
	{
		Integer[] a= {2,6,8,9,22,44,67};
	List<Integer> list = Arrays.asList(a);
	
	ArrayList<Integer> h= new ArrayList<>(list);
	System.out.println(h);

	}

}
