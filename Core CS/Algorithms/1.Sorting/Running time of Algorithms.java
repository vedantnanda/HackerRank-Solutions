import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int runningTime(int[] A){
        int count=0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i ;
            while(j > 0 && A[j-1] > value){
                A[j] = A[j-1];
                j = j - 1;
                count++;
            }
            A[j] = value;
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
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}