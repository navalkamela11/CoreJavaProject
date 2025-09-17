package java_Exercise;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str ="Anybody can do the automation";
//		
//		String reverse = "";
//		
//		 for (int i = str.length() - 1; i >= 0; i--) {
//	            reverse = reverse + str.charAt(i);
//	      }
//
//	        System.out.println("Original: " + str);
//	        System.out.println("Reversed: " + reverse);
//		
		int num = 17092025;
		int sum = 0;
		
		while (num > 0) {
			
			int rem = num % 10;
            num = num/10;
            sum = sum + rem;
        }

        System.out.println("Sum of digits: " + sum);
		
	}

}
