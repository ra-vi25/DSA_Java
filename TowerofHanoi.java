//Tower of Hanoi using Recursion
import java.util.Scanner;
public class TowerofHanoi {

    // Method to solve the Tower of Hanoi problem
    // n -> number of disks, src -> source pole, aux -> auxiliary pole, dest -> destination pole
    void toh(int n, char src, char aux, char dest) {
        // Base case: If there are no disks to move
        if (n != 0) {
            // Move n-1 disks from source to auxiliary pole, using destination as auxiliary
            toh(n - 1, src, dest, aux);

            // Move the nth disk from source to destination pole
            System.out.println("Move disk " + n + " from " + src + " to " + dest);

            // Move n-1 disks from auxiliary pole to destination pole, using source as auxiliary
            toh(n - 1, aux, src, dest);
        }
    }
    public static void main(String[] args) {
        // Create an object of TowerofHanoi class
        TowerofHanoi obj = new TowerofHanoi();

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of disks
        System.out.println("Enter number of disks: ");
        int n = sc.nextInt();  // Read the number of disks

        // Call the toh method to solve the Tower of Hanoi problem
        // 'A', 'B', 'C' represent the source, auxiliary, and destination poles
        obj.toh(n, 'A', 'B', 'C');

        // Close the scanner object
        sc.close();
    }
}
