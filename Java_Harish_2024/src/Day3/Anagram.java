package Day3;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "dad";
        String str2 = "add";
        
        // Normalize input
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return; // Exit if lengths do not match
        }

        // Initialize ArrayLists for character counts
        List<Integer> count1 = new ArrayList<>();
        List<Integer> count2 = new ArrayList<>();
        
        // Initialize lists with zero counts
        for (int i = 0; i < 11; i++) {
            count1.add(0);
            count2.add(0);
        }
        
        // Count characters for str1
        for (char c : str1.toCharArray()) {
            int index = c - 'a';
            count1.set(index, count1.get(index) + 1);
        }
        
        // Count characters for str2
        for (char c : str2.toCharArray()) {
            int index = c - 'a';
            count2.set(index, count2.get(index) + 1);
        }
        
        // Compare frequency lists
        if (count1.equals(count2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
