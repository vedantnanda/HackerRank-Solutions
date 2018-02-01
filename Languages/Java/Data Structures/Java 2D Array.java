import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int p=0; p < 6; p++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[p][j] = in.nextInt();
            }
        }
            int i,j,high=0;
            int sum;
            for(i=0;i<4;i++)
                {
                sum=0;
                for(j=0;j<4;j++)
                    {
                    sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(i==0 && j==0)
                        high=sum;
                    if(sum>high)
                      high=sum;
                    }
                }
                System.out.println(high);            
        }
    }
