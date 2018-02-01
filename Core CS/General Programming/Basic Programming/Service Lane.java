import java.io.*;
import java.util.*;

public class Solution {

    static int[] serviceLane(int n, int[][] cases,int[] width) {
        int[] output= new int[n];
        int column=0;
        for(int i=0;i<n;i++)
        {
           int x=cases[i][column];
           int y=cases[i][column+1];
           int min=4;
            for(int j=x;j<=y;j++)
            {
                if(width[j]<min)
                    min=width[j];
            }
            output[i]=min;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for(int width_i = 0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for(int cases_i = 0; cases_i < t; cases_i++){
            for(int cases_j = 0; cases_j < 2; cases_j++){
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        int[] result = serviceLane(t, cases,width);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}