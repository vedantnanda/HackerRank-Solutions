import java.io.*;
import java.util.*;
public class Solution {

    public static int searchY(int[] a,int x,int q){
    int i;
        for(i=0;i<a.length;i++)
        {
        if(x==a[i])
          { 
            //return (searchZ(a,i+1));
            break;
        }
           }
        if(q==0)
            return (searchY(a,i+1,1));
        else return i+1;
}
   

public static void main(String args[] ) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=scan.nextInt();
    }
    for(int i = 0; i<n; i++){
        System.out.println(searchY(arr,i+1,0));
    }
}
}