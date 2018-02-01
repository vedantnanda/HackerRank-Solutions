import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        long price[]=new long[m*n];
        int max,min;
        
        int i,j=0,k=0;
        for(i=0;i<n;i++)
        {
        	for(j=0;j<m;j++)
        	{
        		price[k]=keyboards[i]+pendrives[j];
        		k++;
        	}
        }
        Arrays.sort(price);
        for(i=0;i<k;i++)
        /*{
        	System.out.println("price "+i+"is: "+price[i]);
        }*/
        j=0;
        for(i=k-1;i>=0;i--)
        {
        	//System.out.println("price[i]: "+price[i]);
        	if(price[i]<=s)
        	{
        		System.out.println(price[i]);
        		System.exit(0);
        		j++;
        	}
        	//System.out.println("i: "+i+" j: "+j);
        	if(i==0 && j==0)
        	{
        		System.out.println("-1");
        	}
        }
    }
}