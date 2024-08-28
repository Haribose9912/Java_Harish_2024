package StringBuilder;
import java.util.*;

public class Reverse_Array_num {

	    public static void main(String[] args) {
	        // Initialize the array
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Convert the array to an ArrayList
	        List<Integer> numberList = new ArrayList<>();
	        for (int num : numbers) {
	            numberList.add(num);
	        }

	        // Reverse the ArrayList manually
	        List<Integer> rev_list = new ArrayList<>();
	        for (int i = numberList.size() - 1; i >= 0; i--) {
	        	rev_list.add(numberList.get(i));
	        }

	        // Print the reversed ArrayList
	        System.out.print("Reversed Number List: ");
	        for (int num : rev_list) {
	            System.out.print(num);
	        }
       }
}

