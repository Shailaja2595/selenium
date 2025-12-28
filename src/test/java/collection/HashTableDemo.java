package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String, Object> ht = new Hashtable<>();
		ht.put("Name", "shailaja");
		ht.put("Experience", 10);
		ht.put("Location", "Pune");
		ht.put("Job Status", false);
		
		System.out.println("Name of the Person :"+ht.get("Name"));
		System.out.println("Experience  of the Person is :"+ht.get("Experience"));
		System.out.println("Location of the Person is :"+ht.get("Location"));
		System.out.println("Is Person working anywhere : "+ht.get("Job Status"));
	}

}
