package StringBuilder;

public class even_odd {
    public static void main(String[] args) {
        String s = "hellohariesh";  
        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && i >= 2) {
                // Calculate the position for inserting the reversed character
                int position = sb.length() - (i / 2);
                
                // Get the character from the original string
                char charToInsert = s.charAt(i);
                
                // Insert the character at the calculated position in reversed order
                sb.insert(position, charToInsert);
            } else {
                // Append characters at odd indices and the first two characters (index 0 and 1)
                sb.append(s.charAt(i));
            }
        }

        // Output the result
        System.out.println("Combined reversed and non-reversed chars: " + sb);
    }
}

