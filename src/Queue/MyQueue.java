package Queue;

public class MyQueue {
    int queue[];
    int rear;
    int front;
    int capacity;
    public MyQueue(int capacity)
    {
        rear=-1;
        front=-1;
        this.capacity=capacity;
        queue=new int[capacity];
    }
    public boolean overFlow()
    {
        if (rear== queue.length-1)
        {
            return true;
        }
        return false;
    }
    public boolean underFlow()
    {
        if (front==-1 && rear==-1)
        {
            return true;
        }
        return false;
    }
    void enqueue(int data)
    {
        if (overFlow())
        {
            System.out.println("OverFlow!!");
        }
        else {
            if (front ==-1 && rear==-1)
            {
                front=0;
                rear=0;
                queue[rear]=data;
            }
            else {
                rear=rear+1;
                queue[rear]=data;
            }
        }
    }
    void dequeue()
    {
        if (underFlow()) {
            System.out.println("Underflow!!");
        }
        else {
            front++;
        }
    }
    void display()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
}
