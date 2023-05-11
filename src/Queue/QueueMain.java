package Queue;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MycircularQueue mycircularQueue   =new MycircularQueue(5);
        while (true) {
            System.out.println("Enter Your Choice!!");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the data!!");
                    int data;
                    mycircularQueue.enqueue(data = scanner.nextInt());
                    break;
                case 2:
                    mycircularQueue.dequeue();
                    break;
                case 3:
                    mycircularQueue.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input !!");
            }
        }
    }
}
