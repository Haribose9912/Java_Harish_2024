import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        System.out.println("Second largest: " + arr[arr.length - 2]);
    }
}


// public class SecondLargest {
//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};

//         if (arr.length < 2) {
//             System.out.println("Array must have at least two elements.");
//             return;
//         }

//         // Step 1: Find the largest element
//         int largest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }

//         // Step 2: Find the second largest (excluding the largest)
//         Integer secondLargest = null;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != largest) {
//                 if (secondLargest == null || arr[i] > secondLargest) {
//                     secondLargest = arr[i];
//                 }
//             }
//         }

//         // Step 3: Output result
//         if (secondLargest == null) {
//             System.out.println("No second largest element.");
//         } else {
//             System.out.println("Second largest element is: " + secondLargest);
//         }
//     }
// }


