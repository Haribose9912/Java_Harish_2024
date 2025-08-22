package Day3;
import java.util.*;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        
        // Count digits
        int digits = String.valueOf(num).length();
        
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
        
        sc.close();
    }
}

// **Armstrong numbers** are special numbers where:

// > If you take each digit, raise it to the power of how many digits the number has, and then add those up, you get the original number back.

// Example:

// * Number: **153**
//   Number of digits = 3
//   Calculation: $1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$
//   Since the sum equals the number itself, **153 is an Armstrong number.**

// * Number: **123**
//   Number of digits = 3
//   Calculation: $1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36$
//   Sum is not equal to 123, so **123 is NOT an Armstrong number.**

// All single-digit numbers (0 to 9) are Armstrong numbers because $d^1 = d$.

