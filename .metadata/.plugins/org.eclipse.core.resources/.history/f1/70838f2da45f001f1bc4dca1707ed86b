package Day2;
import java.util.*;

public class Char_ouccrance_list {
    public static void main(String[] args) {
        String text = "hariesh";
        
        // Initialize lists to store characters and their counts
        List<Character> characters = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        // Count occurrences of each character
        for (char c : text.toCharArray()) {
            int index = characters.indexOf(c);
            
            if (index != -1) {
                // Character is already in the list; update count
                counts.set(index, counts.get(index) + 1);
            } else {
                // Character is not in the list; add it
                characters.add(c);
                counts.add(1);
            }
        }

        // Print occurrences
        for (int i = 0; i < characters.size(); i++) {
            System.out.println("'" + characters.get(i) + "': " + counts.get(i));
        }
    }
}
