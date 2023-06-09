package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            boolean swapped=false;
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j+1]< arr[j])
                {
                    swapped=true;
                    swap(arr,j+1,j);
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
    private static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
