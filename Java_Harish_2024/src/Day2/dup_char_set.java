package Day2;

import java.util.*;

public class dup_char_set {
	 public static void main(String[] args) {
	        String s = "ttstat";
	        Set<Character> uniqueChars = new HashSet<>();
	        Set<Character> duplicateChars = new HashSet<>();
	        int count = 0;

	        for (char ch : s.toCharArray()) {
	            if (!uniqueChars.add(ch)) { // add returns false if the element was already present
	                if (duplicateChars.add(ch)) { // add returns false if the element was already present
	                    count++;
	                }
	            }
	        }

	        System.out.println("Duplicate chars: " + duplicateChars);
	        System.out.println("Unique chars: " + uniqueChars);
	        System.out.println("Count of duplicate chars: " + count);
	    }
	}