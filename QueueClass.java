public class QueueClass {
    int []queue_arr;
    int front,rear, size;

    QueueClass (int max_size)
    {
        //Queue array initialization
        queue_arr = new int[max_size];
        size = max_size;
        front = rear  = -1;
    }
    public void enqueue(int x)
    {
        if(rear == size - 1)
        {
            System.out.println("Overflow");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            queue_arr[rear] = x;
            System.out.println("Inserted : " + x);
        }
        else
        {
            queue_arr[++rear] = x;
            System.out.println("Inserted : " + x);
        }
    }
    public void dequeue()
    {
        int x;
        if(front == -1 && rear == -1)
        {
            System.out.println("empty");
        }
        else if(front == rear)
        {
            x = queue_arr[front] ;
            front = rear = -1;
            System.out.println("Deleted : " + x );
        }
        else
        {
            x = queue_arr[front++] ;
            System.out.println("Deleted : " + x );
        }
    }
    public void display()
    {

        if(front == - 1 && rear == -1)
        {
            System.out.println("empty");
        }
        else
        {
            for(int i = front; i <= rear; i++)
            {
                System.out.println(queue_arr[i]);
            }
        }
    }

    public static  void main(String[] args)
    {
        QueueClass obj = new QueueClass(5);

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        System.out.println("Data are : ");
        obj.display();

        // remove element from stack
        obj.dequeue();
        System.out.println("After deleted : ");
        obj.display();
        obj.enqueue(60);

    }
}
