import java.util.*;

public class anagramWithMap {

  public static void main(String args[]) {
    String words[] = {"haris", "name", "anme", "hari"};

    Map<String, String> map = new HashMap<>();

    for (String word : words) {
      String cleaned = word.replaceAll("\\s", "");

      char chars[] = cleaned.toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);

      if (map.containsKey(sorted)) {
        System.out.println("Found anagrams: " + word + " and " + map.get(sorted));
      } else {
        map.put(sorted, word);
      }
    }
  }
}
