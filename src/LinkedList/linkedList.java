package LinkedList;

public class linkedList {
    public static void main(String[] args) {
        Node n1=new Node(100);
        Node n2=new Node(200);
        Node n3=new Node(300);
        Node n4=new Node(400);
        Node n5=new Node(500);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;


        traverse(head);

        //        Node newHead=insertion(30,head,0);
        //        traverse(newHead);

//        Node newHead=deletion(0,head);
        System.out.println(countNode(head));
        traverse(head);
    }

    public static void traverse(Node head)
    {
        Node cur=head;
        while (cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public static Node insertion(int data,Node head,int pos)
    {
        Node newNode=new Node(data);
        if (pos==0)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node prev=head;
        for (int i = 0; i <pos-1 ; i++) {
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return head;
    }
    public static Node deletion(int pos,Node head)
    {
        if (pos==0)
        {
            head=head.next;
            return head;
        }
        Node prev =head;
        for (int i = 0; i <pos-1 ; i++) {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static int countNode(Node head)
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
