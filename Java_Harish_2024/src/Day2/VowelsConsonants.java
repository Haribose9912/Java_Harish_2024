public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {   // check only letters
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            }
        }
    }
}
