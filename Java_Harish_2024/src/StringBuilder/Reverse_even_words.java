package StringBuilder;

public class Reverse_even_words {


	    public static void main(String[] args) {
	    	String s = "welcome to mindtree hyderabad";
	        
	        String[] ss = s.split(" ");
	     
	        StringBuilder sb = new StringBuilder();
	     
	        for (int i = 0; i < ss.length; i++) {
	            if ((i + 1) % 2 == 0) { // Check if index is even (1-based)
	                String revs = "";
	                for (int j = 0; j < ss[i].length(); j++) {
	                    char c = ss[i].charAt(j);
	                    revs = c + revs; // Manually reverse the word
	                }
	                sb.append(revs); // Append the reversed word
	            } else {
	                sb.append(ss[i]); // Keep the word unchanged
	            }
	            sb.append(" "); // Add space after each word
	        }
	     
	        System.out.println("Result: " + sb.toString().trim());
    }
}
