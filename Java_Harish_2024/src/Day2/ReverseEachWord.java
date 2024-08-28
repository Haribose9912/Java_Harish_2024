package Day2;

public class ReverseEachWord {
	   

	    // Method to reverse each word in a string and print the result
	    public static void reverseEachWordAndPrint(String str) {
	        String[] words = str.split(" "); // Split the string into words

	        // Iterate through each word
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder();

	            // Reverse the word using a for loop
	            for (int i = word.length()-1; i >= 0; i--) {
	                reversedWord.append(word.charAt(i));
	            }

	            // Print the reversed word followed by a space
	            System.out.print(reversedWord.toString() + " ");
	        }
	    }
	    
	    public static void main(String[] args) {
	        String input = "Hello am harish thanks to the program";
	        reverseEachWordAndPrint(input);
	    }
}

