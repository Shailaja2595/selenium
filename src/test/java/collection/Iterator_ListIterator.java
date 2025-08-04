package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListIterator 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		ListIterator l=a.listIterator();
		System.out.println("List iterator - forward teration");
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("List iterator - backward teration");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
	}

}
