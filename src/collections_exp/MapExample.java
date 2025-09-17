package collections_exp;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> Delegates = new HashMap<>();
		
		// Insert data into the map
		Delegates.put("CEO", "Camilla");
		Delegates.put("COO", "Ivy");
		Delegates.put("CFO", "Jame");
		Delegates.put("CHO", "Ivy");
		
		// Print
		System.out.println(Delegates);
		
		//Remove a data
		Delegates.remove("CHO");
		System.out.println(Delegates);
		
		// Update a data
		Delegates.put("COO","Arnel");
		System.out.println(Delegates);
		
		//print all the keys
		System.out.println(Delegates.keySet());
		
		// print values inside the map
		
		System.out.println("CEO of the company"+ Delegates.get("CEO"));
		
		// OR  
		
		for(String key: Delegates.keySet()) {
			System.out.println(key + " " + Delegates.get(key));
		}
				

	}

}
