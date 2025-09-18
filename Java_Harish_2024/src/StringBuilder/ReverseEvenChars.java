public class ReverseEvenChars {
    public static void main(String[] args) {
        String s = "harieshkumar";
        StringBuilder sb = new StringBuilder(s);

        // Step 1: Collect even-index characters
        StringBuilder evens = new StringBuilder();
        for (int i = 0; i < sb.length(); i += 2) {
            evens.append(sb.charAt(i));
        }

        // Step 2: Reverse the collected even chars
        evens.reverse();

        // Step 3: Put them back into even indices
        int k = 0;
        for (int i = 0; i < sb.length(); i += 2) {
            sb.setCharAt(i, evens.charAt(k++));
        }

        System.out.println(sb);
    }
}
