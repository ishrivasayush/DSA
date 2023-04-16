package Array;

import java.util.Arrays;

public class Revsere {
    public static void main(String[] args) {
        int arr5[]={100,200,300,400,500};
        reverse(arr5,5);
        System.out.println(Arrays.toString(arr5));
    }
    static void reverse(int[] arr,int n)
    {
        int start=0,end=n-1;
        while (start!=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    void rvereseArray(int arr[], int start,int  end)
    {
        if (start != end)
            return;

        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive Function calling
        rvereseArray(arr, start + 1, end - 1);
    }
}


