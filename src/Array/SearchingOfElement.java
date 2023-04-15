package Array;

import java.util.Scanner;

public class SearchingOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an Array!");
        int n=scanner.nextInt();
        System.out.println("Enter the key element:");
        int k = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(linearSearch(arr,k));
        System.out.println(binarySearch(arr,k));
    }
    //O(n)
    static int linearSearch(int arr[],int key) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    //O(logn)
    static int binarySearch(int arr[],int key)
    {
        int mid,beg=0,end=arr.length-1;
        while (end!=beg)
        {
            mid=(end+beg)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            else if (arr[mid]<key)
            {
                beg=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
