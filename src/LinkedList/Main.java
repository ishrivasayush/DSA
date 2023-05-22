package LinkedList;

public class Main {
    public static class Node{
        int data;
        Node next;
    }
    public static class linkedList{
        int size;
        Node head;
        Node tail;

        public void display()
        {
            for (Node temp=this.head;temp!=null;temp=temp.next)
            {
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
        public void addLast(int data)
        {
            Node nodeNew=new Node();
            nodeNew.data=data;
            nodeNew.next=null;
            if (size==0)
            {
                head=tail=nodeNew;
            }
            else {
                tail.next = nodeNew;
                tail=nodeNew;
            }
            size++;
        }
        public  int getFirst()
        {
            if(size==0)
            {
                System.out.println("LinkedList is Empty !!");
                return -1;
            }
            return head.data;
        }
        public int getLast()
        {
            if(size==0)
            {
                System.out.println("LinkedList is Empty !!");
                return -1;
            }
            return tail.data;
        }
        public int getAt(int index)
        {
            if (size==0)
            {
                System.out.println("LinkedList is Empty !!");
                return -1;
            }
            else if(index<0 || index>=size)
            {
                System.out.println("Incorrect Errors !!");
                return -1;
            }
            Node temp=head;
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
            return temp.data;
        }

        //O(1)
        void addFirst(int data)
        {
            Node newNode=new Node();
            newNode.data=data;
            if (size==0)
            {
                head=tail=newNode;
            }
            else {
                newNode.next=head;
                head=newNode;
            }
        }
        public void removeFirst()
        {
            if (size==0)
            {
                System.out.println("LinkedList is Empty!!");
            } else if (size==1) {
                head=tail=null;
                size=0;
            } else {
                head=head.next;
                size--;
            }
        }
        public void addAt(int data,int index)
        {
            if (size==0)
            {
                addFirst(data);
            }
            else if(index==size)
            {
                addLast(data);
            }
            else if(index<0 || index > size)
            {
                System.out.println("Invalid index");
            }
            else {
                Node temp=head;
                for (int i = 0; i <index-1 ; i++) {
                    temp=temp.next;
                }
                Node prev=temp.next;
                Node newNode=new Node();
                newNode.data=data;
                newNode.next=prev;
                temp.next=newNode;
                size++;
            }
        }
    }


    public static void main(String[] args) {
        linkedList linkedList=new linkedList();
        linkedList.addLast(100);
        linkedList.addLast(200);
        linkedList.addLast(300);
        linkedList.addLast(400);
        System.out.println(linkedList.size);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getAt(3));
        linkedList.addAt(567,2);
        linkedList.removeFirst();
        linkedList.display();
        linkedList.removeFirst();
        linkedList.display();
    }
}
