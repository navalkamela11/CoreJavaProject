package collections_exp;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> Numbers = new HashSet<>();
		
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		
		//print out all the numbers
		System.out.println(Numbers);
		
		// Add number 3 again
		// Set does not allow any duplicates
		Numbers.add(3);
		System.out.println(Numbers);
		
		// print all numbers using for loop
		for(int num: Numbers) {
			System.out.println(num);
		}
		
		
		

	}

}
