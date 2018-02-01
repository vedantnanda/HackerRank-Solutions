import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
            {
              String s=sc.next();
            int y=s.length();
            char[]a=s.toCharArray();
            for(int j=0;j<y;j++)
                {
                if(j%2==0)
                    System.out.print(a[j]);
            }
            System.out.print(" ");
            for(int j=0;j<y;j++)
                {
                if(j%2!=0)
                    System.out.print(a[j]);
            }
            System.out.print("\n");
            }
            }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }