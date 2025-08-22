package Day1;

import java.util.*;

public class String_methods {
    public static void main(String[] args) {
        // =============================
        // 1. STRING METHODS
        // =============================
        String str = "  Java Programming  ";
        String str2 = "java programming";

        System.out.println("=== String Methods ===");
        System.out.println("Length: " + str.length());
        System.out.println("CharAt(5): " + str.charAt(5));
        System.out.println("Equals: " + str.trim().equals(str2));
        System.out.println("EqualsIgnoreCase: " + str.trim().equalsIgnoreCase(str2));
        System.out.println("CompareTo: " + "apple".compareTo("banana"));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
        System.out.println("IndexOf 'a': " + str.indexOf("a"));
        System.out.println("LastIndexOf 'a': " + str.lastIndexOf("a"));
        System.out.println("Substring(2,6): " + str.substring(2, 6));
        System.out.println("Concat: " + str.concat(" is fun"));
        System.out.println("Replace 'a'->'o': " + str.replace('a', 'o'));
        System.out.println("ToUpperCase: " + str.toUpperCase());
        System.out.println("Trim: '" + str.trim() + "'");

        String csv = "red,green,blue";
        String[] colors = csv.split(",");
        System.out.println("Split: ");
        for (String color : colors) System.out.println(color);

        String joined = String.join("-", "2025", "08", "19");
        System.out.println("Joined: " + joined);

        // =============================
        // 2. STRINGBUILDER METHODS
        // =============================
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("\n=== StringBuilder Methods ===");
        sb.append(" World");                      // append
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");                   // insert
        System.out.println("Insert: " + sb);

        sb.delete(5, 10);                        // delete
        System.out.println("Delete: " + sb);

        sb.replace(6, 11, "Universe");           // replace
        System.out.println("Replace: " + sb);

        sb.reverse();                            // reverse
        System.out.println("Reverse: " + sb);

        sb.reverse(); // make it normal again
        System.out.println("CharAt(1): " + sb.charAt(1));
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity()); // default 16 + length
        System.out.println("Substring(0,5): " + sb.substring(0,5));

        // =============================
        // 3. STRINGBUFFER METHODS
        // =============================
        StringBuffer sbuf = new StringBuffer("Welcome");

        System.out.println("\n=== StringBuffer Methods ===");
        sbuf.append(" User");                    // append
        System.out.println("Append: " + sbuf);

        sbuf.insert(7, " Java");                 // insert
        System.out.println("Insert: " + sbuf);

        sbuf.delete(7, 12);                      // delete
        System.out.println("Delete: " + sbuf);

        sbuf.replace(0, 7, "Hello");             // replace
        System.out.println("Replace: " + sbuf);

        sbuf.reverse();                          // reverse
        System.out.println("Reverse: " + sbuf);

        sbuf.reverse(); // normal again
        System.out.println("CharAt(2): " + sbuf.charAt(2));
        System.out.println("Length: " + sbuf.length());
        System.out.println("Capacity: " + sbuf.capacity());
        System.out.println("Substring(0,5): " + sbuf.substring(0,5));
    }
}
