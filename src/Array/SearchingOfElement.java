package Array;

import java.util.Scanner;

public class SearchingOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key element:");
        int k = scanner.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(linearSearch(arr,k));
    }
    static int linearSearch(int arr[],int key) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
