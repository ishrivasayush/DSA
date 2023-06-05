package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter The Element:");
            arr[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

    }
    private static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
