import java.io.*;
import java.util.*;

public class hr_test40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter n: ");
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++)
        {
            A[A_i] = in.nextInt();
        }
        int i,j,count=0,low=0;
        for(i=0;i<n;i++)
        {
        	count=0;
        	for(j=i+1;j<n;j++)
        	{
        		if(A[i]!=A[j])
        			count++;
        		//System.out.println("i: "+i+" Count: "+count);
        		if(i==0 && j==(n-1))
        		{
        			low=count+1;
        			//System.out.println("low: "+low);
        		}
        		if((A[i]==A[j]) && (count<low))
        		{
        			low=count+1;
        			//System.out.println("low2: "+low);
        			//continue;
        		}
        		
        	}
        }
        if(low>=n)
            System.out.println("-1");
        else if(n==1)
            System.out.println("-1");
        else
        System.out.println(low);
    }
}