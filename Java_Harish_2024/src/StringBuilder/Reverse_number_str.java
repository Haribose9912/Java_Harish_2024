package StringBuilder;

public class Reverse_number_str {

	 public static void main(String[] args) {
	        int givenNumber = 12345;

	        String numberStr = String.valueOf(givenNumber);
	        String reversedStr = "";

	     
	        for (int i = 0; i < numberStr.length(); i++) {
	            char c = numberStr.charAt(i);
	            reversedStr = c + reversedStr;
	        }

	        // Convert the reversed string back to an integer
	        int reversedNumber = Integer.parseInt(reversedStr);

	        System.out.println("Reversed Number: " + reversedNumber);
	}
}
