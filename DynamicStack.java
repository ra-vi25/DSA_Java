//STack using Linked List
import java.util.Scanner;
public class DynamicStack {

    // Inner Node class represents an element of the stack
    static class Node {
        int info;   // Data held by the node
        Node next;  // Reference to the next node

        // Constructor to initialize the node
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    Node top = null; // Pointer to the top of the stack

    // Helper method to check if the stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Push operation: Adds an element to the top of the stack
    void push(int x) {
        Node newNode = new Node(x); // Create a new node with data x
        if (!isEmpty()) {          // If the stack is not empty
            newNode.next = top;    // Link the new node to the current top
        }
        top = newNode;             // Update top to the new node
    }

    // Pop operation: Removes and returns the top element of the stack
    void pop() {
        if (isEmpty()) {           // If the stack is empty
            System.out.println("Stack is empty");
        } else {
            System.out.println("Deleted : " + top.info); // Print the value of the top node
            top = top.next;        // Update top to point to the next node
        }
    }

    // Display operation: Shows all elements in the stack
    void display() {
        if (isEmpty()) {           // If the stack is empty
            System.out.println("Stack is empty");
        } else {
            Node temp = top;       // Temporary pointer to traverse the stack
            System.out.println("Stack data are:");
            while (temp != null) { // Traverse the stack and print each element
                System.out.println(temp.info);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DynamicStack obj = new DynamicStack(); // Create an instance of the stack
        Scanner sc = new Scanner(System.in);  // Scanner for user input
        int x, ch;                            // Variables for input and menu choice

        // Menu-driven program
        while (true) {
            // Display menu options
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt(); // Read user's choice

            // Perform operation based on user's choice
            switch (ch) {
                case 1:
                    // Push operation
                    System.out.println("Enter data : ");
                    x = sc.nextInt();  // Read the value to be pushed
                    obj.push(x);       // Add the value to the stack
                    break;

                case 2:
                    // Pop operation
                    obj.pop();         // Remove the top element
                    break;

                case 3:
                    // Display operation
                    obj.display();     // Show all elements in the stack
                    break;

                case 4:
                    // Exit program
                    System.exit(0);    // Terminate execution
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid Choice");
            }
        }
    }
}
