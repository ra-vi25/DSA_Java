//Implementation of Circular Queue Using Array
public class CircularQueue {
    // Array to hold queue elements
    int[] queue_arr;

    // Front and rear pointers, and size of the queue
    int front, rear, size;

    // Constructor to initialize the queue
    CircularQueue(int max_size) {
        queue_arr = new int[max_size]; // Initialize queue array
        size = max_size;              // Set the size of the queue
        front = rear = -1;            // Initialize front and rear to -1 (queue is empty)
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1; // Returns true if both front and rear are -1
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return front == (rear + 1) % size; // Returns true if front is next to rear in a circular manner
    }

    // Method to enqueue (add) an element to the circular queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Overflow"); // Queue overflow condition
        } else if (isEmpty()) {
            // If the queue is empty, initialize front and rear, and add the element
            front = rear = 0;
            queue_arr[rear] = x;
            System.out.println("Inserted : " + x);
        } else {
            // Increment rear in a circular manner and add the new element
            rear = (rear + 1) % size;
            queue_arr[rear] = x;
            System.out.println("Inserted : " + x);
        }
    }

    // Method to dequeue (remove) an element from the circular queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("empty"); // Queue underflow condition
        } else if (front == rear) {
            // If only one element is left, reset front and rear
            int x = queue_arr[front];
            front = rear = -1;
            System.out.println("Deleted : " + x);
        } else {
            // Remove the front element and increment the front pointer in a circular manner
            int x = queue_arr[front];
            front = (front + 1) % size;
            System.out.println("Deleted : " + x);
        }
    }

    // Method to display the elements in the circular queue
    public void display() {
        if (isEmpty()) {
            System.out.println("empty"); // No elements to display
        } else {
            // Loop through the queue in a circular manner
            int i = front;
            while (true) {
                System.out.println(queue_arr[i]);
                if (i == rear) break; // Stop when the rear is reached
                i = (i + 1) % size;   // Move to the next index circularly
            }
        }
    }

    // Main method to test the CircularQueue class
    public static void main(String[] args) {
        // Create a circular queue with a maximum size of 5
        CircularQueue obj = new CircularQueue(5);

        // Enqueue elements into the queue
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);

        // Display the queue contents
        System.out.println("Data are : ");
        obj.display();

        // Remove (dequeue) an element from the queue
        obj.dequeue();
        System.out.println("After deletion: ");
        obj.display();

        // Add another element to the queue
        obj.enqueue(60);
        System.out.println("After adding 60: ");
        obj.display();
    }
}
