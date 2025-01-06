import java.util.Scanner;
public class SingleLinkedList {
    //node declaration
    static class Node {
        int info;
        Node next;
// constructor to initialize
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    //start to point first node
    Node start = null;

    //Add data at first
    void insertFirst(int x) {
        Node newNode = new Node(x); // creating new node
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
    }

    //Add data at Last
    void insertLast(int x) {
        Node newNode = new Node(x);
        if (start == null) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

     //Display data
    void display() {
        if (start == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = start;
            System.out.println("Linked List Data are : ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
        }
    }

    //Delete first node
    void deleteFirst()
    {
        if(start == null){
            System.out.println("Linked List is empty");
        }
        else{
            start = start.next;
        }
    }

    //delete last node
    void deleteLast()
    {
        if(start == null){
            System.out.println("Linked List is empty");
        }
        //one node only
        else if(start.next == null){
            start = null;
        }
        else{
            Node temp = start;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void main(String[] args) {
        int ch, x;
        SingleLinkedList obj = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Insert First\n2.Insert Last\n3.Delete First\n4.Delete Last\n5.Display\n6.Exit");
            System.out.println("Enter Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter x : ");
                    x = sc.nextInt();
                    obj.insertFirst(x);
                    break;
                case 2:
                    System.out.println("Enter x : ");
                    x = sc.nextInt();
                    obj.insertLast(x);
                    break;
                case 3:
                    obj.deleteFirst();
                    break;
                case 4:
                    obj.deleteLast();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

}