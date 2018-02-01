import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        int sum=sumf(arr);
        System.out.println(sum);
    }
    public static int sumf(int arr[][])
    {
    	int i,j,sum=0,high=0;
    	for(i=0;i<4;i++)        
            for(j=0;j<4;j++)    
            {
                  sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    	if(i==0 && j==0) 
    	{
            high=sum;
    	}
            if(sum>high)
            {
            	high=sum;
            }
            }
    	return high;
    }
}
