package collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "Selenium");
		
		System.out.println(map.get(1));  // Java
		System.out.println(map.get(2)); 

	}

}
