package Array;

import java.util.Scanner;

public class CreationAndTraversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int arr[]={100,200,300,400,500};
        int arr1[]=new int[5];
        int arr2[]=new int[]{200,300,400,500};

        System.out.println(arr.length);
        System.out.println(arr1.length);

        for (int i = 0; i <arr.length ; i++) {
            arr1[i]= scanner.nextInt();
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr);
        }

    }
}
