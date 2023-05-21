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
    }

    public static void main(String[] args) {
        linkedList linkedList=new linkedList();
        linkedList.addLast(100);
        linkedList.addLast(200);
        linkedList.addLast(300);
        linkedList.addLast(400);
        System.out.println(linkedList.size);
        linkedList.display();
    }
}
