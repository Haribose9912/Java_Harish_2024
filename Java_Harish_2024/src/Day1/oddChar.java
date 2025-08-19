package Day1;

public class oddChar {
    public static void main(String[] args) {
        String str = "aravindkumar";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i += 2) { // odd indices
            char ch = str.charAt(i);
            sb.append(ch).append(", ");
            System.out.println("Index: " + i + " -> Character: " + ch);
        }

     

        System.out.println("All odd index characters: " + sb);
    }
}
