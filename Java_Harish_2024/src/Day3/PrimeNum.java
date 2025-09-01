package Day3;

public class PrimeNum {

    public static void main(String[] args) {
        int n = 17;
        int count = 0;

        if (n < 2) {
            System.out.println(n + " is not a prime number.");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++; // if any factor found, increment count
                break;   // no need to check further
            }
        }

        if (count == 0) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
