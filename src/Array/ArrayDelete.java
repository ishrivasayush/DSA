package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of an Array!");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the Position!");
        int pos= scanner.nextInt();
        deleteElement(arr,n,pos);
//        deleteArrayElements(arr1,n,pos);
    }
    //Approach 1
    static void deleteElement(int arr[],int n,int pos)
    {
        int arrNew[]=new int[n-1];
        for (int i = 0; i < arr.length ; i++) {
            if (i<pos-1)
            {
                arrNew[i]=arr[i];
            } else if (i==pos-1) {
                continue;
            }
            else {
                arrNew[i-1]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrNew));
    }
    //Approach 2
    static void deleteArrayElements(Integer arr[],int n,int pos)
    {
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        list.remove(pos-1);
        arr=list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
