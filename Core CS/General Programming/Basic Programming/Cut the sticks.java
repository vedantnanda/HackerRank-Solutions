import java.io.*;
import java.util.*;

public class Solution {

    static int findMin(int[] a)
    {
        int min=a[a.length-1];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0 && a[i]<min)
                min=a[i];
        }
        return min;
    }
    static void printarr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print("-> "+arr[i]);
        System.out.println();
    }
    static int[] cutTheSticks(int[] arr) 
    {
        Arrays.sort(arr);
        int[] count=new int[arr.length];
        count[0]=arr.length;
       for(int i=0;i<arr.length;i++)
       {
           
           int min=findMin(arr);
           //System.out.println("min: "+min);
           for(int j=0;j<arr.length;j++)
           {
               if(arr[j]!=0)
                    arr[j]=arr[j]-min;
              // printarr(arr);
           }
           //printarr(arr);
           int c=0;
           for(int j=0;j<arr.length;j++)
           {
               if(arr[j]!=0)
                   c++;
           }
          // System.out.println("c= "+c);
           if(c==0) {break;}
           if(c!=0 && c!=count[i])
             count[i+1]=c;
           
           
       }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i]!=0)System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}