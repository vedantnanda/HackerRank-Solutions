import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	//System.out.println("Enter a b k: ");
    	int a=sc.nextInt();
    	//System.out.println(revnum(a));
    	int b=sc.nextInt();
    	int k=sc.nextInt();
    	int c=0;
    	int i,n,z;
    	for(i=a;i<=b;i++)
    	{
    		n=revnum(i);
    		//System.out.println("Z: "+n);
    		if(Math.abs(n-i)%k==0)
    		{
    			c++;
    		}
    		
    	}
    	System.out.println(c);
    }
    public static int revnum(int n)
    {
    	int out=0;
    	while(n>0)
    	{
    		out=out*10+n%10;
    		n=n/10;
    	}
    	return out;
    }
}