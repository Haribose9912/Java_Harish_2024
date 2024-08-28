package StringBuilder;

public class Rev_num {
	    public static void main(String[] args) {
	        int givenNumber = 12345;
	        int reversedNumber = 0;

	        // Use a for loop with initialization, condition, and update in the loop header
	        for (int number = givenNumber; number != 0; number /= 10) {
	            int digit = number % 10;  // Extract the last digit
	            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
	        }

	        System.out.println("Reversed Number: " + reversedNumber);
	}
}

