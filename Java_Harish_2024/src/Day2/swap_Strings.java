package Day2;

public class swap_Strings {
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";

	        System.out.println("Before swapping:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);

	        // Swap the strings without using a third variable
	        str1 = str1 + str2; // Concatenate str1 and str2
	        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
	        str1 = str1.substring(str2.length()); // Extract original str2

	        System.out.println("After swapping:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);
	    }
}

