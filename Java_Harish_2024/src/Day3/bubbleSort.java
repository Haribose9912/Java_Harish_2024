package Day3;

public class bubbleSort {

	    public static void main(String[] args) {
	        char[] array = {'d', 'a', 'c', 'b', 'e'};
	        
	        bubbleSort(array);
	        
	        System.out.println("Sorted array: ");
	        for (char c : array) {
	            System.out.print(c + " ");
	        }
	    }

	    public static void bubbleSort(char[] array) {
	        int n = array.length;
	        boolean swapped;
	        
	        // Bubble Sort algorithm
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    char temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no elements were swapped, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
   }


}
