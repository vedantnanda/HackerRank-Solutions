import java.io.*;
import java.util.*;
import java.text.*;

public class hr_test43 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int c=0,x=1;
        if(p<(n/2))
        {
        	if(n==p || p==1 || (p>2 && p<4 && ((p-1)%2==0) ) || ( (p>2) && (p<5) && ((p+1)%2!=0) ) )
        		{
        			c=0;
        			System.out.println(c);
        		//	System.out.println("c initial: "+c);
        			System.exit(0);
        	}
        }
        else
        	if(n==p || ((n-p)<2 && ((p-1)%2==0) ) || ((n-p)<2 && ((p+1)%2!=0) ))
        	{
        		c=0;
    			System.out.println(c);
    	//		System.out.println("c initial2: "+c);
    			System.exit(0);
        	}
        int y=n;
        while(x<p && n>p)
        {
        if(p>(y/2) && (n-p)>1)
        {
        	n=n-2;
        	c++;
         if(n-p==1)
        	{
        		System.out.println(c);
        		System.exit(0);
        	}
        }
        else
        {
        	x=x+2;
        	c++;
        }
        }
        System.out.println(c);
    }
}