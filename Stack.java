//Implementation of Stack using array
public class Stack {
    // Array to hold stack elements
    int[] stack_arr;

    // Top of the stack and size of the stack
    int top, size;

    // Constructor to initialize the stack
    Stack(int max_size) {
        // Initialize stack array with given maximum size
        stack_arr = new int[max_size];
        size = max_size; // Set the size of the stack
        top = -1;        // Initialize top to -1 (stack is empty)
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Returns true if top is -1
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1; // Returns true if top reaches the last index
    }

    // Method to push an element onto the stack
    public void push(int x) {
        // Check if the stack is full
        if (isFull()) {
            System.out.println("Overflow"); // Stack overflow condition
        } else {
            // Increment top and add the new element
            stack_arr[++top] = x;
            System.out.println("Inserted : " + x);
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            System.out.println("empty"); // Stack underflow condition
        } else {
            // Retrieve the top element and decrement top
            int x = stack_arr[top--];
            System.out.println("Deleted : " + x);
        }
    }

    // Method to display the elements in the stack
    public void display() {
        // Check if the stack is empty
        if (isEmpty()) {
            System.out.println("empty"); // No elements to display
        } else {
            // Loop through the stack and print each element
            for (int i = 0; i <= top; i++) {
                System.out.println(stack_arr[i]);
            }
        }
    }

    // Main method to test the Stack class
    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        Stack stack = new Stack(5);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the stack contents
        System.out.println("Data are : ");
        stack.display();

        // Remove (pop) an element from the stack
        stack.pop();

        // Display the stack contents after popping
        System.out.println("After popping out");
        stack.display();
    }
}
