import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n;
       //System.out.print("Enter n: ");
       n=sc.nextInt();
       int a[]=new int[n];
       int i,j;
       for(i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       }
       sc.close();
       int mode=0,max=0;
       for(i=0;i<n;i++)
       {
    	   max=0;
    	   for(j=0;j<n;j++)
    	   {
    		   if(a[i]==a[j])
    			   max++;
    		   if(i==0 && j==0)
    			   mode=max;
    	   }
    		   
    		   if(max>mode)
    			   mode=max;
    	   }
       
       //System.out.println("MODE: "+mode);
       System.out.println(n-mode);
    }
}