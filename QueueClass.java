//Implementing Linear Queue using array
public class QueueClass {
    // Array to hold queue elements
    int[] queue_arr;

    // Front and rear pointers, and size of the queue
    int front, rear, size;

    // Constructor to initialize the queue
    QueueClass(int max_size) {
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
        return rear == size - 1; // Returns true if rear reaches the last index
    }

    // Method to enqueue (add) an element to the queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Overflow"); // Queue overflow condition
        } else if (isEmpty()) {
            // If the queue is empty, initialize front and rear, and add the element
            front = rear = 0;
            queue_arr[rear] = x;
            System.out.println("Inserted : " + x);
        } else {
            // Increment rear and add the new element
            queue_arr[++rear] = x;
            System.out.println("Inserted : " + x);
        }
    }

    // Method to dequeue (remove) an element from the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("empty"); // Queue underflow condition
        } else if (front == rear) {
            // If only one element is left in the queue, reset front and rear
            int x = queue_arr[front];
            front = rear = -1;
            System.out.println("Deleted : " + x);
        } else {
            // Remove the front element and increment the front pointer
            int x = queue_arr[front++];
            System.out.println("Deleted : " + x);
        }
    }

    // Method to display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("empty"); // No elements to display
        } else {
            // Loop through the queue and print each element
            for (int i = front; i <= rear; i++) {
                System.out.println(queue_arr[i]);
            }
        }
    }

    // Main method to test the QueueClass
    public static void main(String[] args) {
        // Create a queue with a maximum size of 5
        QueueClass obj = new QueueClass(5);

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

    }
}
