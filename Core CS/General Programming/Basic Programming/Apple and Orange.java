import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int i,count1=0,count2=0;
        for(i=0;i<m;i++)
        {
        	int x=apple[i]+a;
        	if(x>=s && x<=t)
        		count1++;
        }
        for(i=0;i<n;i++)
        {
        	int x=orange[i]+b;
        	if(x>=s && x<=t)
        		count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}