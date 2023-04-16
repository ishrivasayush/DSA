package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of an Array!");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        takeInput(arr);
        bubbleSort(arr,n);
        print(arr);
    }
    public static int[] takeInput(int arr[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Array Elements!");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static void print(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[],int n)
    {
        boolean Swapped;
        for (int i = 0; i <n-1 ; i++) {
            Swapped=false;
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Swapped=true;
                }
            }
            if (Swapped==false)
            {
                break;
            }
        }
    }
}
