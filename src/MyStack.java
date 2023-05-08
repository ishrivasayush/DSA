public class MyStack {
    int top;
    int capacity;
    int stack[];
    public MyStack(int capacity)
    {
        this.capacity=capacity;
        top=-1;
        stack=new int[capacity];
    }
    boolean isEmpty()
    {
        if (top==-1)
        {
            return true;
        }
        return false;
    }
    boolean isFull()
    {
        if (top==capacity-1)
        {
            return true;
        }
        return false;
    }
    void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Overflow!");
        }
        else {
            stack[++top] = data;
        }
    }
    void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is UnderFlow!");
        }
        else {
            top--;
        }
    }
    int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Underflow!");
        }
        return stack[top];
    }

    public static void main(String[] args) {
        MyStack myStack=new MyStack(5);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
        System.out.println(myStack.peek());
        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        myStack.push(400);
        myStack.push(500);
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
    }
}
