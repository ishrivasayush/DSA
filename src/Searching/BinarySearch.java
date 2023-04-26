package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int x:arr) {
            System.out.println(x);
        }
        System.out.println("Enter the value of Key");
        int Key= scanner.nextInt();
//        System.out.println(binarySearch(arr,Key));
        System.out.println(binarySearchr(arr,Key,0,n-1));
    }
    // O(logn)
    static int binarySearch(int arr[],int key)
    {
        int low=0,high=arr.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]<key)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
    // In Recursion Method one recursive stack is also created so its takes logn space in the memory
    static int binarySearchr(int arr[],int key,int low,int high)
    {
        if (low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if (arr[mid]==key)
        {
            return mid;
        }
        if (arr[mid]<key)
        {
            return binarySearchr(arr,key,mid+1,high);
        }
        return binarySearchr(arr,key,low,mid-1);
    }
}
