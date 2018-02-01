import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();
        }
        double m=0,u=0,p=0;
        for(int i=0;i<n;i++)
            {
            if(a[i]>0)
                {
                m++;
            }
            else if(a[i]<0)
                {
                u++;
            }
            else if(a[i]==0)
                {
                p++;
            }
        }
        System.out.println((m/n)+"\n"+(u/n)+"\n"+(p/n));

    }
}