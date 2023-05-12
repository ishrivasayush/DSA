package Queue;

public class MyDequeue {
    int capacity;
    int[] dequeue;
    int front;
    int rear;
    public MyDequeue(int capacity)
    {
        this.capacity=capacity;
        front=-1;
        rear=-1;
        dequeue=new int[capacity];
    }
    boolean isFull()
    {
        if (front==(rear+1)%capacity)
        {
            return true;
        }
        return false;
    }
    boolean isEmpty()
    {
        if (rear==-1 && front==-1 || rear==front)
        {
            return true;
        }
        return false;
    }
    void pushFront(int data)
    {
        if (isFull())
        {
            System.out.println("Overflow!");
        } else {
            if (front==-1 && rear==-1)
            {
                front=0;
                rear=0;
                dequeue[rear]=data;
            } else if (front==0) {
                front=capacity-1;
            }
            else {
                front=(front-1)%capacity;
                dequeue[front]=data;
            }
        }
    }
    void popRear()
    {
        if (isEmpty())
        {
            System.out.println("Underflow!!");
        }
        else if (front==rear)
        {
            front=rear=-1;
        }
        else {
            rear=(rear-1)%capacity;
        }
    }
    void popFront()
    {
        if (isEmpty()) {
            System.out.println("Underflow!!");
        } else if (front==rear) {
            System.out.println("Underflow!!");
            front=-1;
            rear=-1;
        } else {
            front=(front+1)%capacity;
        }
    }
    void enqueue(int data)
    {
        if (isFull())
        {
            System.out.println("OverFlow!!");
        }
        else {
            if (front ==-1 && rear==-1)
            {
                front=0;
                rear=0;
                dequeue[rear]=data;
            }
            else {
                rear=(rear+1)%capacity;
                dequeue[rear]=data;
            }
        }
    }
}
