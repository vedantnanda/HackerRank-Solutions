import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     private static int lonelyInteger(int[] a) 
     {
       Arrays.sort(a);
         if(a.length==1)
             return a[0];
         for(int i=0;i<a.length-1;)
             {
             if(a[i]==a[i+1])
                 {
                 a[i]=-1;
                 a[i+1]=-1;
                 i=i+2;
             }
             else
                 i++;
         }
         for(int i=0;i<a.length;i++)
             {
             if(a[i]>0)
                return a[i];
         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}