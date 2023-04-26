package Array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                System.out.println("Enter The Values:");
                arr1[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                System.out.print(arr1[j][i]);
            }
            System.out.println();
        }
    }
}
