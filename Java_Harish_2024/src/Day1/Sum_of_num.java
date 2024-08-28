package Day1;

public class Sum_of_num {

	    public static void main(String[] args) {
	        int[] numbers = {3, -1, 4, 12, 0, -5, 7}; // Example array

	        // Compute the sum
	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	        // Print the result
	        System.out.println("Sum of numbers: " + sum);
	    }
}

