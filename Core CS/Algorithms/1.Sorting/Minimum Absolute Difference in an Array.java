import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        long min=a[a.length-1];
        for(int a_i=0; a_i < n-1; a_i++){
                if(Math.abs(a[a_i]-a[a_i+1])<min){
                    min=Math.abs(a[a_i]-a[a_i+1]);
                    }                   
           }        
           System.out.println(min);      
     }
}