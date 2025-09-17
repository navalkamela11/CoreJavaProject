package collections_exp;

import java.util.HashMap;
import java.util.Map;


public class PracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "Clean World Green World Happy World Bianca";
		
		Map<String,Integer> count = new HashMap<>();
		
		// Count occurrence of each word
		// Clean = 1
		// Green = 1
		// Happy = 1
		// World = 3
		// Bianca = 1
		
		String[] Words = str.split(" ");
		
		for(String Word : Words) {
			System.out.println(Word);
			
			// check if the word is in the map
			// if the word is found then add +1 to the last value
			// put the latest value back to the map
			
			if(count.keySet().contains(Word)) {
				
				int last = count.get(Word); 
				int latest = last + 1; 
				count.put(Word, latest); 
				
		//if the word is not present
				
			}else {
				count.put(Word, 1);
			}
			
		}
		
		System.out.println(count);

        }

	}
