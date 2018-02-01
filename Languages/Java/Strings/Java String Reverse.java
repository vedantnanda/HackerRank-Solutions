import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter string!");
        
        String A=sc.nextLine();
        String b;
        int x=A.length(),y=0;
        //System.out.println(x);
        //char []a=new char[x-1];
        char []b1=new char[x];
        for(int i=x-1;i>=0;i--)
        {
        	b1[i]=A.charAt(y);
        	y++;
        }
        String B=new String(b1);
        if(A.compareTo(B)==0)
        {
        	System.out.println("Yes");
        }
        else
            {
            System.out.println("No");
        }
        
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}