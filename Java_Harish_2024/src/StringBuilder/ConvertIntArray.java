package StringBuilder;
import java.util.*;

public class ConvertIntArray {

    public static void main(String[] args) {
        int num = 9811;
        ArrayList<Integer> al = new ArrayList<>();
        
        // Call the recursive method to populate the ArrayList
        intToArray(num, al);
        
        // Print the ArrayList to verify the result
        System.out.println(al);
    }
    
    // Recursive method to convert integer to ArrayList
    private static void intToArray(int num, ArrayList<Integer> al) {
        if (num != 0) {
            int temp = num % 10;
            num /= 10;
            intToArray(num, al);
            al.add(temp);
        }
    }
}