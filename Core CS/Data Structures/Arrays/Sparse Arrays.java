import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
       String []s=new String[1000];
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
        	s[i]=sc.next();
        }
        int m=sc.nextInt();
        int c;
        int a[]=new int[1000];
        for(i=0;i<m;i++)
        {
        	c=0;
        	String s2=sc.next();
        	for(j=0;j<n;j++)
        	{
    		int result=s2.compareTo(s[j]);
    		if(result==0)
    		{
    		c++;	
    		}
        	}
        	a[i]=c;
        }
        for(i=0;i<m;i++)
        {
        	System.out.println(a[i]);
        }
    }
}