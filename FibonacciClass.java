//Fibonacci Series using Recursion
import java.util.Scanner;
public class FibonacciClass {

    // Method to calculate nth Fibonacci number using recursion
    int fibo(int n) {
        // Base case: Fibonacci of 0 is 0
        if (n == 0)
            return 0;
            // Base case: Fibonacci of 1 is 1
        else if (n == 1)
            return 1;
            // Recursive case: Fibonacci of n is the sum of the previous two Fibonacci numbers
        else
            return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // Creating an object of FibonacciClass
        FibonacciClass obj = new FibonacciClass();

        // Creating a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter the number of terms in the Fibonacci series
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();

        // Printing the Fibonacci series up to the nth term
        System.out.println("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            // Calling the fibo method to calculate and display each Fibonacci number
            System.out.print(obj.fibo(i) + "  ");
        }
    }
}
