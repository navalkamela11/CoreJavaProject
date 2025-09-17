package collections_exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Names = new ArrayList<>();
		
		Names.add("Camilla");
		Names.add("Bianca");
		Names.add("Ivy");
		Names.add("Arnel");
		Names.add("Anna");
		Names.add("Jame");
		
		System.out.println(Names);
		System.out.println("Total Names are " + Names.size());
		
		Names.remove(5); // (Anna)remove in the list
		System.out.println(Names);
		System.out.println("Total Names are " + Names.size());
		
		//Update Name
		System.out.println("Update Name");
		Names.set(0, "Camille");
		System.out.println(Names);
		
		// Validate the name
		if(Names.contains("Anna")) {
			System.out.println("Anna is still present in the list");
		} else {
			System.out.println("Anna is not present in the list");
		}
		
		// Sorting the List of Names
		Collections.sort(Names);
		System.out.println("After sorting names");
		System.out.println(Names);
		
		//printing all the names
		for(String Name :Names) {
			System.out.println(Name);
		}
		
		// Add more same name
		Names.add("Arnel");
		System.out.println(Names);
		
		
		
	}

}
