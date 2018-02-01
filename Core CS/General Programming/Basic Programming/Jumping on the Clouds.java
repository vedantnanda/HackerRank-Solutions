import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter n: ");
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++)
        {
            c[c_i] = in.nextInt();
        }
        in.close();
        int i,j=0,c1=0;
        for(i=0;i<n;)
        {
        	if(i<(n-2) && c[i+2]==0)
        	{
        	j=j+2;
        	c1++;
        	 //System.out.println("count1: "+c1);
        	 //System.out.println("j1: "+j);
        	}
             else if(i<(n-1) && c[i+1]==0)
             {
            	 j=j+1;
            	 c1++;
            	 //System.out.println("count2: "+c1);
            	 //System.out.println("j2: "+j);
             }
        	if(j>=n-1)
        	{
        		 //System.out.println("count3: "+c1);
        		i=n+1;
        	}
        	else
        	{ 
        		i=j;
        		if(i>=n-1)
        		{
        			//System.out.println("count4: "+c1);
        			i=n+1;
        		}
        	}
        }

        System.out.println(c1);
        
    }
}