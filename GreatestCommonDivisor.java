//Greatest Common Divisor using Recursion
import java.util.Scanner;
public class GreatestCommonDivisor {

    // Method to calculate the GCD (Greatest Common Divisor) using recursion
    int gcd(int a, int b) {
        // Base case: If b is 0, then a is the GCD
        if (b != 0)
            return gcd(b, a % b);  // Recursively call with b and the remainder of a divided by b
        else
            return a;  // Return a when b is 0, as the GCD is a
    }

    public static void main(String[] args) {
        // Create an object of GreatestCommonDivisor class
        GreatestCommonDivisor obj = new GreatestCommonDivisor();

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();  // First number
        int b = sc.nextInt();  // Second number

        // Call the gcd method to calculate and print the GCD of the two numbers
        System.out.println("Gcd is " + obj.gcd(a, b));
    }
}
