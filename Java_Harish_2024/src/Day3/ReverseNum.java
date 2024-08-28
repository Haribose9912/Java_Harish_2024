package Day3;

public class ReverseNum {
	   
	    public static int reverseNumber(int number) {
	        String numStr = Integer.toString(number); // Convert number to string
	        String reversedStr = "";

	        for (int i = numStr.length() - 1; i >= 0; i--) {
	            reversedStr += numStr.charAt(i); // Append characters in reverse order
	        }

	        return Integer.parseInt(reversedStr); // Convert reversed string back to integer
	    }
	    public static void main(String[] args) {
	        int number = 12345;
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Original number: " + number);
	        System.out.println("Reversed number: " + reversedNumber);
	    }

}

