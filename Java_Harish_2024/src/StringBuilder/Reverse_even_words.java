package StringBuilder;

public class Reverse_even_words {


	    public static void main(String[] args) {
 String s = "hariesh am here how are you bye";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        ArrayList<String> sl = new ArrayList<>();
        StringBuilder rev = new StringBuilder();

        for (int i = 2; i < words.length; i++) {
            if (i % 2 == 0) {
                sl.add(words[i] + ":" + i);
                // Use words[i] instead of word
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    rev.append(words[i].charAt(j));
                }
                rev.append(" ");
            }
        }
        System.out.println(sl);
        System.out.println(rev);
    }
}
