import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            int count=0;
            for(int j=1;j<=Math.sqrt(m);j++)
                if(m%j==0)
                count++;
            if(count==1 && m!=1)
                System.out.println("Prime");
            else if(count>0)
                System.out.println("Not prime");
        }
    }
}