import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                if((i!=j) && ((a[i]+a[j])%k==0) && (i<j))
                    {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}