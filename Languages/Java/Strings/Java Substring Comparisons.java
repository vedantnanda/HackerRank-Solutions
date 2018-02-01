import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.next();
    	int k=sc.nextInt();
    	sc.close();
    	//System.out.println(s);
    	String s2 ="";
    	int n=s.length();
    	String s1[]=new String[n-(k-1)];
    	int i,j,l=0;
    	for(i=0,j=0;j<=n;j++,i++)
    	{
        	s2=s2.concat(s);
        	//System.out.println(s2);
    		s1[j]=s2.substring(i,(i+k));
    		//System.out.println(s1[j]);
    		s2="";
    		if(i+k==n)
    		{
    			//System.out.println("breaks out, j= "+j);
    			l=j;
    			j=n+1;
    		}
    	}
    	Arrays.sort(s1);
    		System.out.println(s1[0]+"\n"+s1[l]);
    }
}