package Day2;
import java.util.*;
public class Duplicate_numbers {
	    public static void main(String[] args) {
	        // Initialize the array
	        int[] arr = {1, 3, 1, 3, 5, 1, 3, 6, 7, 6};
	        
	        // Convert the array to an ArrayList
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }

	        System.out.println("Original List: " + list);

	        // Lists to hold unique and duplicate numbers
	        ArrayList<Integer> uniqueList = new ArrayList<>();
	        ArrayList<Integer> duplicateList = new ArrayList<>();

	        // Use a copy of the original list to process
	        ArrayList<Integer> listCopy = new ArrayList<>(list);

	        // Identify unique and duplicate numbers
	        for (int i = 0; i < listCopy.size(); i++) {
	            int num = listCopy.get(i);
	            int count = 0;
	            
	            // Count occurrences of 'num'
	            for (int j = 0; j < listCopy.size(); j++) {
	                if (listCopy.get(j).equals(num)) {
	                    count++;
	                }
	            }
	            
	            // Only add to the lists if not already added
	            if (count == 1 && !uniqueList.contains(num)) {
	                uniqueList.add(num);
	            } else if (count > 1 && !duplicateList.contains(num)) {
	                duplicateList.add(num);
	            }
	        }

	        // Output unique and duplicate numbers
	        System.out.println("Unique numbers: " + uniqueList);
	        System.out.println("Duplicate numbers: " + duplicateList);
	    }
}

//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        // Initialize the array
//        int[] arr = {1, 3, 1, 3, 5, 1, 3, 6, 7, 6};
//        
//        // Convert the array to an ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int num : arr) {
//            list.add(num);
//        }
//
//        System.out.println("Original List: " + list);
//
//        // Lists to hold unique and duplicate numbers
//        ArrayList<Integer> uniqueList = new ArrayList<>();
//        ArrayList<Integer> duplicateList = new ArrayList<>();
//
//        // Process the list to find unique and duplicate numbers
//        for (int i = 0; i < list.size(); i++) {
//            int num = list.get(i);
//            int count = 0;
//            
//            // Count occurrences of 'num'
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j).equals(num)) {
//                    count++;
//                }
//            }
//
//            // Add to unique or duplicate list based on count
//            if (count == 1 && !uniqueList.contains(num)) {
//                uniqueList.add(num);
//            } else if (count > 1 && !duplicateList.contains(num)) {
//                duplicateList.add(num);
//            }
//        }
//
//        // Output unique and duplicate numbers
//        System.out.println("Unique numbers: " + uniqueList);
//        System.out.println("Duplicate numbers: " + duplicateList);
//    }
//}
