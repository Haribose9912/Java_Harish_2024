import java.util.*;

public class CountWords {

    public void countWord(String s) {
        int count = 1;
        s = s.toLowerCase().trim();
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }

        System.out.println("Word count: " + count);
    }

    public static void main(String[] args) {
        CountWords m = new CountWords();
        String ws = "hello am haries how are yoy here thabks";
        m.countWord(ws);
    }
}
