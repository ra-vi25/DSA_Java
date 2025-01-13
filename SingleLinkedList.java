import java.util.Scanner;
public class SingleLinkedList {

    // Defining a Node
    static class Node {
        int info; // Data in the node
        Node next; // Pointer to the next node

        // Constructor to initialize a node
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    Node start = null; // Pointer to the start of the linked list

    // Check if the linked list is empty
    boolean isEmpty() {
        return start == null;
    }

    // Insert a node at the beginning of the list
    void insertFirst(int x) {
        Node newNode = new Node(x); // Create a new node
        if (!isEmpty()) {          // If list is not empty, point newNode to current start
            newNode.next = start;
        }
        start = newNode;           // Update start to the new node
    }

    // Insert a node at the end of the list
    void insertLast(int x) {
        Node newNode = new Node(x); // Create a new node
        if (isEmpty()) {            // If the list is empty, set start to the new node
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode;    // Update the last node's next pointer to newNode
        }
    }

    // Delete the first node of the list
    void deleteFirst() {
        if (isEmpty()) {            // If the list is empty, print a message
            System.out.println("No Node");
        } else {
            start = start.next;     // Update start to the second node
        }
    }

    // Delete the last node of the list
    void deleteLast() {
        if (isEmpty()) {            // If the list is empty, print a message
            System.out.println("No Node");
        } else if (start.next == null) { // If there is only one node
            start = null;           // Set start to null
        } else {
            Node temp = start;
            while (temp.next.next != null) { // Traverse to the second-last node
                temp = temp.next;
            }
            temp.next = null;       // Set the second-last node's next to null
        }
    }

    // Display the linked list
    void display() {
        if (isEmpty()) {            // If the list is empty, print a message
            System.out.println("No Node");
        } else {
            Node temp = start;
            System.out.println("Linked List data:");
            while (temp != null) {  // Traverse the list and print each node's value
                System.out.print(temp.info + "  ");
                temp = temp.next;
            }
        }
    }

    // Search for a value in the linked list
    void search(int x) {
        if (isEmpty()) {            // If the list is empty, print a message
            System.out.println("No Node");
        } else {
            Node temp = start;
            boolean found = false;  // Flag to track if the data is found
            while (temp != null) {
                if (x == temp.info) {
                    found = true;
                    break;
                }
                temp = temp.next;
            }
            if (found) {
                System.out.println("Data Found");
            } else {
                System.out.println("Data not Found");
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList obj = new SingleLinkedList(); // Create an instance of SingleLinkedList
        Scanner sc = new Scanner(System.in);          // Scanner for user input
        int x;                                        // Variable to store user input

        // Menu-driven program to perform operations on the singly linked list
        while (true) {
            // Display menu options
            System.out.println("\n1.Insert First\n2.Insert Last\n3.Delete First\n4.Delete Last");
            System.out.println("5.Display\n6.Search\n7.Exit");
            System.out.println("Enter choice: ");
            int ch = sc.nextInt(); // Read the user's choice

            // Perform the operation based on the user's choice
            switch (ch) {
                case 1:
                    // Insert a node at the beginning
                    System.out.println("Enter data to insert at the beginning:");
                    x = sc.nextInt();       // Read the data
                    obj.insertFirst(x);    // Call the insertFirst method
                    break;

                case 2:
                    // Insert a node at the end
                    System.out.println("Enter data to insert at the end:");
                    x = sc.nextInt();       // Read the data
                    obj.insertLast(x);     // Call the insertLast method
                    break;

                case 3:
                    // Delete the first node
                    obj.deleteFirst();     // Call the deleteFirst method
                    break;

                case 4:
                    // Delete the last node
                    obj.deleteLast();      // Call the deleteLast method
                    break;

                case 5:
                    // Display all nodes in the linked list
                    obj.display();         // Call the display method
                    break;

                case 6:
                    // Search for a value in the linked list
                    System.out.println("Enter data to search:");
                    x = sc.nextInt();       // Read the data
                    obj.search(x);         // Call the search method
                    break;

                case 7:
                    // Exit the program
                    System.exit(0);        // Terminate program execution
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid Choice");
            }
        }
    }
}
