import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	//System.out.println("Enter: ");
    	int n=sc.nextInt();
    	int i,j,count=0;
    	int a[]=new int[n];
    	for(i=0;i<n;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	sc.close();
    	    int sum   = 0;
    	    for (i = 0; i <n; i++) 
    	    {
    	        for (j = i; j <n; j++) 
    	        {
    	            sum += a[j];
    	            //System.out.print(" i= "+i+" a[j]= "+a[j]);
    	            //System.out.print(" sum= "+sum);
    	            if (sum < 0) 
    	            {
    	                count++;
    	               // System.out.print(" count= "+count);
    	            }
    	        }
    	        //System.out.println();
    	        sum = 0;
    	    }
    	System.out.println(count);
    }
}