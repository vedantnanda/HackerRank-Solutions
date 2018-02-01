import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int max=height[0];
        int i;
        for(i=0;i<n;i++)
            {
            if(height[i]>max)
                {
                max=height[i];
            }
        }
        int c=0;
        for(i=0;i<n;i++)
            {
                if(height[i]==max)
                    {
                    c++;
                }
        }
        System.out.println(c);
    }
}