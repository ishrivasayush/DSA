package Queue;

public class MycircularQueue {
    int circularQueue[];
    int rear;
    int front;
    int capacity;
    public MycircularQueue(int capacity)
    {
        rear=-1;
        front=-1;
        this.capacity=capacity;
        circularQueue=new int[capacity];
    }
    public boolean overFlow()
    {
        if (front==(rear+1)%capacity)
        {
            return true;
        }
        return false;
    }
    public boolean underFlow()
    {
        if (front==-1 && rear==-1 || front==rear)
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
                circularQueue[rear]=data;
            }
            else {
                rear=(rear+1)%capacity;
                circularQueue[rear]=data;
            }
        }
    }
    void dequeue()
    {
        if (underFlow()) {
            System.out.println("Underflow!!");
        } else if (front==rear) {
            System.out.println("Underflow!!");
            front=-1;
            rear=-1;
        } else {
            front=(front+1)%capacity;
        }
    }
    void display()
    {
        int i;
        for ( i = front; i !=rear ; i=(i+1)%capacity) {
            System.out.println(circularQueue[i]);
        }
        System.out.println(circularQueue[i]);
    }
}
