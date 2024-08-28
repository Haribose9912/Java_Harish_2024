package Day2;

public class Swap2Strings {
	
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";

	        System.out.println("Before swapping:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);

	        // Swap the strings
	        String[] swappedStrings = swapStrings(str1, str2);
	        str1 = swappedStrings[0];
	        str2 = swappedStrings[1];

	        System.out.println("After swapping:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);
	    }

	    // Method to swap two strings
	    public static String[] swapStrings(String s1, String s2) {
	        String temp = s1; // Store the first string in a temporary variable
	        s1 = s2; // Assign the second string to the first
	        s2 = temp; // Assign the temporary string to the second
	        return new String[]{s1, s2}; // Return the swapped strings as an array
	    }
	    
}
