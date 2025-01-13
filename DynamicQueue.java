import java.util.Scanner;
public class DynamicQueue {

    // Inner Node class represents an element of the queue
    static class Node {
        int info;   // Data held by the node
        Node next;  // Reference to the next node

        // Constructor to initialize the node
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    Node front = null; // Pointer to the front of the queue
    Node rear = null;  // Pointer to the rear of the queue

    // Helper method to check if the queue is empty
    boolean isEmpty() {
        return front == null && rear == null;
    }

    // Enqueue operation: Adds an element to the rear of the queue
    void enqueue(int x) {
        Node newNode = new Node(x); // Create a new node with data x
        if (isEmpty()) {            // If the queue is empty
            front = newNode;        // The new node becomes the front
        } else {                    // If the queue is not empty
            rear.next = newNode;    // Link the current rear to the new node
        }
        rear = newNode;             // Update rear to the new node
    }

    // Dequeue operation: Removes an element from the front of the queue
    void dequeue() {
        if (isEmpty()) {            // If the queue is empty
            System.out.println("Queue is Empty");
        } else if (front == rear) { // If there is only one element in the queue
            System.out.println("Deleted : " + front.info); // Print the data being removed
            front = null;          // Set front to null
            rear = null;           // Set rear to null
        } else {                   // If there are multiple elements in the queue
            System.out.println("Deleted : " + front.info); // Print the data being removed
            front = front.next;    // Update front to the next node
        }
    }

    // Display operation: Shows all elements in the queue
    void display() {
        if (isEmpty()) {            // If the queue is empty
            System.out.println("Queue is Empty");
        } else {
            Node temp = front;      // Temporary pointer to traverse the queue
            System.out.println("Queue data are :");
            while (temp != null) {  // Traverse the queue and print each element
                System.out.print(temp.info + "  ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DynamicQueue obj = new DynamicQueue(); // Create an instance of the queue
        Scanner sc = new Scanner(System.in);  // Scanner for user input
        int x, ch;                            // Variables for input and menu choice

        // Menu-driven program
        while (true) {
            // Display menu options
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt(); // Read user's choice

            // Perform operation based on user's choice
            switch (ch) {
                case 1:
                    // Enqueue operation
                    System.out.println("Enter data: ");
                    x = sc.nextInt();  // Read the value to be enqueued
                    obj.enqueue(x);    // Add the value to the queue
                    break;

                case 2:
                    // Dequeue operation
                    obj.dequeue();     // Remove the front element
                    break;

                case 3:
                    // Display operation
                    obj.display();     // Show all elements in the queue
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
