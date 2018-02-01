import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void insertIntoSorted(int[] ar) 
    {
       int len=ar.length;
        int x=ar[len-1];
        for(int i=len-1;i>0;i--)
            {
            if(ar[i]<x)
            {ar[i]=x;break;}
            else
                {
                if(ar[i-1]<x)
                {ar[i]=x;printArray(ar);break;}
                    else
                    ar[i]=ar[i-1];
                if(i==1)
                {printArray(ar);ar[0]=x;}
            }
            printArray(ar);
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 