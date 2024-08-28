package StringBuilder;

public class Reverse_each_words {
	
	 public static void main(String[] args) {
	        String s = "welcome to mindtree hyderabad";
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        for (String word : words) {
	            String revs = ""; // This will hold the reversed word
	            for (int i = 0; i < word.length(); i++) {
	                char c = word.charAt(i);
	                revs = c + revs; // Add each character to the beginning
	            }
	            result.append(revs).append(" "); // Add the reversed word and a space
	        }
	        
	        System.out.println("Reversed words: " + result.toString().trim());
	 }
}