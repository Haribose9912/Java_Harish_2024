package Day2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0; 
        int b = 1; 
        
        if (n <= 0) {
            System.out.println("Provide a number greater than zero.");
        } else {
            System.out.print("Fibonacci Series for number : "+n+"\n");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int c = a + b; // Calculate next term
                a = b; // Update a to the next term
                b = c; // Update b to the new term
            }
            System.out.println(); // Move to the next line after printing the series
        }
    }
}
