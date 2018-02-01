import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        in.close();
        Arrays.sort(a);
        Arrays.sort(b);
        int x,i,j;
        int count1=0,count2=0,finalcount=0;
        for(x=a[n-1];x<=b[m-1];x++)
        {
        	count1=0;
        	count2=0;
        	for(i=0;i<n;i++)
        	{
        		if(x%a[i]==0)
        		{
        			count1++;
        		}
        	}
        	for(j=0;j<m;j++)
        	{
        		if(b[j]%x==0)
        		{
        			count2++;
        		}
        	}	
        		if(count1==n && count2==m)
        		{
        			//System.out.println("x= "+x);
        			finalcount++;
        		}
        	}
        System.out.println(finalcount);
    }
}