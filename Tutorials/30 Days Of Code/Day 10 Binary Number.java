import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hr_test29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter integer: ");
        int n = in.nextInt();
        String s=Integer.toBinaryString(n);
       // System.out.println(s);
        int count1=0;
        int i;
        int max=0;
        for(i=0;i<s.length();)
        {
        	
        	if(s.charAt(i)=='1')
        	{	
        		count1++;
        		//System.out.println("count1:"+count1);
        			if(s.charAt(i+1)=='1')
        			{
        				count1++;
        				i++;
        				//System.out.println("count2: "+count1);
        				
        			}
        			i++;
        			//System.out.println("i: "+i);
        			//max=count1;
        			if(i==s.length()-2)
        			{
        				if(s.charAt(s.length()-1)=='1' && s.charAt(s.length()-2)=='1' )
        				{
        					count1=count1+2;
        				}
        				
        				i=s.length()+1;
        			}
        			if(i==s.length()-1)
        			{
        				if(s.charAt(s.length()-1)=='1' /*&& s.charAt(s.length()-2)=='1'*/ )
        				{
        					count1++;
        				}
        				
        				i=s.length()+1;
        			}
        			
        	}
        	else
        	{
        		i=i+1;
        		count1=0;
        	}
        	if(count1>max)
        	{
        		max=count1;
        		//System.out.println("max: "+max);
        	}
        	if(count1==s.length())
        	{
        		break;
        	}
        }
        System.out.println(max);
    }
}