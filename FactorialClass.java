//Factorial using Recursion
import java.util.Scanner;
public class FactorialClass {

    // Method to calculate factorial using recursion
    int fact(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0)
            return 1;
        else
            // Recursive call: n * factorial of (n-1)
            return n * fact(n - 1);
    }
    public static void main(String[] args) {
        // Creating an object of FactorialClass
        FactorialClass obj = new FactorialClass();

        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter an integer
        System.out.println("Enter data: ");
        int n = sc.nextInt();

        // Calculating and displaying the factorial of the entered number
        System.out.println("Factorial is " + obj.fact(n));
    }
}
