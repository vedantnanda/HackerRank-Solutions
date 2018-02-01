import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                a[arr_i][arr_j] = in.nextInt();
            }
        }
            int i,j,sum=0,high=0;
            for(i=0;i<4;i++)
                {
                for(j=0;j<4;j++)
                    {
                    sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    if(i==0 && j==0)
                        high=sum;
                    if(sum>high)
                        high=sum;
                }
            }
        System.out.println(high);
            
        }
    
}