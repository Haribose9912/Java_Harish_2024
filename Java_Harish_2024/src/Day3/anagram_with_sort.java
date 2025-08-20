package Day3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "rood";
        String str2 = "door";

        // Normalize input
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Quick length check
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }

        // Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Arrays.sort(arr1);  //built in sort
        // Arrays.sort(arr2); 
        bubblesort_Anagram.bubbleSort(arr1);
        bubblesort_Anagram.bubbleSort(arr2);
        
        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
