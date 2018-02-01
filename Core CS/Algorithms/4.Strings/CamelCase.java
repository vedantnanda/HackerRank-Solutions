import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n=s.length();
        char a[]=s.toCharArray();
        int i,c=1;
        for(i=0;i<n;i++)
        {
        	int k=(int)a[i];
        	if( (k>=65) && (k<=90) )
        	{
        		c++;
        	}
        		
        }
        System.out.println(c);
    }
}