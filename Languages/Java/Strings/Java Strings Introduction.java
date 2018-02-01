import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter two strings!");
        String A=sc.next();
        String B=sc.next();
        
        int i=A.length();
        int j=B.length();
        int sum=i+j;
        int count=0;
        System.out.println(sum);
       int z=0;
       if(i>=j)
       {
    	   z=j;
       }
       else
       {
    	   z=i;
       }
       for(int k=0;k<z;k++)
       {
    	   if(A.charAt(k)>B.charAt(k))
    	   {
    		   System.out.println("Yes");
    		   k=i+j;
    	   }
    	   else
    	   {
    		   System.out.println("No");
    		   k=i+j;
    	   }
       }
        
        char[]c1=A.toCharArray();
        char[]c2=B.toCharArray();
        for(i=0;i<1;i++)
        {
        	char x=A.charAt(i);//toUpperCase();
        	c1[i]=(char) ((char)x+(-32));
        	char y=B.charAt(i);
        	c2[i]=(char) ((char)y+(-32));
        }
        String s1=new String(c1);
        String s2=new String(c2);
        System.out.println(s1+" "+s2);
        /* Enter your code here. Print output to STDOUT. */
        
    }

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}