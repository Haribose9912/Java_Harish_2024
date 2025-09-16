public class CheckSorted {
    public static boolean isSorted(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Compare current element with the next one
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                // If current is greater than next, array is not sorted
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};
        
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
