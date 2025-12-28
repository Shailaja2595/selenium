package collection;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;

public class ArrayListToArrayDemo 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> a= new ArrayList<>();
	a.add(12);
	a.add(68);
	a.add(97);
	a.add(24);
	
	Integer d [] = new Integer[a.size()];
	d = a.toArray(d);
	System.out.println(d[0]);
	System.out.println(d[1]);
	System.out.println(d[2]);
	System.out.println(d[3]);
	}

}
