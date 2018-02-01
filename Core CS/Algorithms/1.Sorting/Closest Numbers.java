import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int[] a1=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++)
            a1[i]=-1;
        
        int i,j,t,min,k=0;
        min=Integer.MAX_VALUE;
        for(i=1;i<n;i++)
        {
            if((arr[i]-arr[i-1])<min)
            {
                min=arr[i]-arr[i-1];
            }
        }
        for(i=1;i<n;i++)
        {
           if((arr[i]-arr[i-1])==min)
           {
               a1[k]=arr[i-1];
               a1[++k]=arr[i];
               k++;
           }       
        }
        return a1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length && result[i]!=-1; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}