package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList1 {

	public static void main(String[] args) {
	
		String [] s= { "shailaja" , "subhash" , "khandekar", "hogale"};
		
		
		
//		for (String string : s) {
//			
//			if(!string.equals("subhash")) {
//						
//			continue;	
//			}
//			System.out.println(string);
//		}
		
		
		
//	List<String> name = Arrays.asList(s);
//	
//	System.out.println(name.contains("shailaja"));
	

//	int [] a= new int[2];
		
		int [] a= {1,2,3,4,5,6};
		
		
//	
//	a[0]=1;
//	a[1]=2;
//	//a[3]=3;
//	
//	for (int i : a) {
//		
//		System.out.println(i);
//	}
////	
//	
	
	
	
	ArrayList a1= new ArrayList();
	
	a1.add(12);
	
	a1.add("subhash");
	
	
	for(int i=0; i<a1.size(); i++) {
		System.out.println(a1.get(1));
	}

	
	
	
	}

}
