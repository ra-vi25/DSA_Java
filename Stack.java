public class Stack {
           int []stack_arr;
        int top, size;

        Stack (int max_size)
        {
            //stack array initialization
            stack_arr = new int[max_size];
            size = max_size;
            top = -1;
        }
        public void push(int x)
        {
            if(top == size - 1)
            {
                System.out.println("Overflow");
            }
            else
            {
                stack_arr[++top] = x;
                System.out.println("Inserted : " + x);
            }
        }
        public void pop()
        {
            int x;
            if(top == - 1)
            {
                System.out.println("empty");
            }
            else
            {
                x = stack_arr[top--] ;
                System.out.println("Deleted : " + x );
            }
        }
        public void display()
        {

            if(top == - 1)
            {
                System.out.println("empty");
            }
            else
            {


                for(int i = 0; i < top; i++)
                {
                    System.out.println(stack_arr[i]);
                }
            }
        }

        public static  void main(String[] args)
        {
            Stack stack = new Stack(5);

            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println("Data are : ");
            stack.display();

            // remove element from stack
            stack.pop();
            System.out.println("After popping out");
            stack.display();
        }
    }


