package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programs_arrays 
{

	public static void main(String[] args) 
	 {
	
//		 bubble_sort();
//		 bubble_String_sort();
//		 maimum();
//	  	ArraySort();
//	    duplicate_no();
//		duplicate_string();
//		duplicate_character();
		even_odd();
		
	}
    
	public static void bubble_sort()
	{
		int [] a= {2,6,1,66,45,33,22,7};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
	
	public static void bubble_String_sort()
	{
		String [] a= {"shailaja","khandekar","subhash","hogale"};
		String temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1]) > 0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
	
	public static void maimum()
	{
		int [] a= {2,6,1,66,45,33,22,7};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("Max="+a[a.length-1]);
		System.out.println("Min="+a[a.length-8]);
	}
	
	public static void ArraySort()
	{
		int [] a= {2,6,1,66,45,33,22,7};
		
		Arrays.sort(a);
//		for(int i:a) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(a));
	}
	public static void duplicate_no()
	{
		int [] a= {2,6,1,6,4,3,2,1,7,1,6};
		
		Map<Integer,Integer> map=new HashMap<> ();
		
		for(int no:a)
		{
		Integer oldval = map.get(no);
			if(oldval==null)
			{
				oldval=0;
			}
			map.put(no, oldval+1);
			
		}
		Set<Integer> u = map.keySet();
		
		for(int n:u) {
			if(map.get(n)>1) {
				System.out.println(n+"="+map.get(n));
			}
				}		
	}
	
	public static void duplicate_string()
	{
	
		String[] str =  {"shailaja"," pune"," subhash"," hogale"," pune"," khandekar" } ;
	
		
		Map<String , Integer > map = new HashMap <> ();
		
		for(String s :str)
		{
			Integer oldval = map.get(s);
			
			if(oldval==null)
			{
				oldval=0;
			}
			map.put(s, oldval+1);
		}
		
	Set<String> hmap = map.keySet();
	
	for(String f:hmap)
	{
		if(map.get(f)>=1)
		{
			System.out.println(f+" = "+map.get(f));
		}
	}
	
	}
	
	public static void duplicate_character()
	{
		String str =  "shailaja khandekar"; 
		char[] o = str.toCharArray();
		
		Map <Character , Integer > map =new HashMap <> ();
		
		for(Character s:o)
		{
		Integer oldval = map.get(s);
		
		if(oldval==null)
		{
			oldval=0;
		}
		
		map.put(s, oldval+1);
		
		}
		
	Set<Character> y = map.keySet();
	for(Character j:y)
	{
		if(map.get(j)>1)
		{
			System.out.println(j+" = "+map.get(j));
		}
	}
	}
	
	public static void even_odd()
	{
		int a[]= {8,6,9,7,2,1,3,4,0};
		
		String even="";
		String odd="";
		
		int e=0;
		int o=0;
		
		for(int i:a) {
			if(i%2==0) {
				even=even+i+" , ";
				e++;
			}
			
			else {
				odd=odd+i+" , ";
				o++;
			}
		}
		
		System.out.println(even+" = "+e);
		System.out.println(odd+" = "+o);
		
	}
	
	
}























