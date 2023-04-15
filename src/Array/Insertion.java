package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        Integer arr[]={10,30,40,50,60};
        int arr1[]={10,30,40,50,60};
        int n=arr1.length;
        int pos=5;
        int x=90;
//        insertX(arr,arr.length,x,pos);
        insertx(arr1,n,x,pos);

    }
    //Approach 1
    static void insertX(Integer arr[],int n,int x,int pos)
    {
        ArrayList<Integer> newArr=new ArrayList<>(Arrays.asList(arr));
        newArr.add(pos-1 ,x);
        arr=newArr.toArray(arr);
        for (int c:arr
             ) {
            System.out.println(c);
        }
    }
    //Approach 2
    static void insertx(int arr[],int n,int x,int pos)
    {
        int a[]=new int[n+1];
        for (int i = 0; i <a.length ; i++) {
            if(i<pos-1)
            {
                a[i]=arr[i];
            } else if (i==pos-1) {
                a[i]=x;
            }
            else {
                a[i]=arr[i-1];
            }
        }
        for(int p:a)
        {
            System.out.println(p);
        }
    }
}
