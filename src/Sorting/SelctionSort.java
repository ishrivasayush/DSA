package Sorting;


import java.util.Arrays;

public class SelctionSort {
    static void selectionSort(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-i-1;
//            int maxIndex=getMaxIndex(arr,0,last);
//            swap(arr,maxIndex,last);
        }
    }

    static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxElementIndex(int[] arr, int start, int last) {
        int max=start;
        for (int i = start; i <last ; i++) {
            if (arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={12,33,2,112,334,21};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
