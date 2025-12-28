package collection;

import java.util.HashMap;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		HashMap<String, Object> hmap = new HashMap<>();
		hmap.put("Name", "shailaja");
		hmap.put("Experience", 10);
		hmap.put("Location", "Pune");
		hmap.put("Job Status", false);
		
		System.out.println("Name of the Person :"+hmap.get("Name"));
		System.out.println("Experience  of the Person is :"+hmap.get("Experience"));
		System.out.println("Location of the Person is :"+hmap.get("Location"));
		System.out.println("Is Person working anywhere : "+hmap.get("Job Status"));
	}

}
