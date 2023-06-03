package Tree;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        Node root=bt.createTree();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);
    }
    Scanner scanner=new Scanner(System.in);
    public Node createTree()
    {
        Node root=null;
        System.out.println("Enter the Data:");
        int data=scanner.nextInt();
        if (data==-1)
        {
            return null;
        }
        root=new Node(data);
        System.out.println("Enter the data for left "+ data);
        root.left=createTree();
        System.out.println("Enter the data for Right "+ data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root)
    {
        if (root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root)
    {
        if (root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if (root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
class Node{
    Node left,right;
    int data;
    public Node(int data)
    {
        this.data=data;
    }
}
