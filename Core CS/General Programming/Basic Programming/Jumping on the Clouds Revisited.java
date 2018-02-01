import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter: ");
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++)
        {
            c[c_i] = in.nextInt();
        }
        int e=100,i;
        for(i=0;i<n;)
        {
        	i=i+k;
            if(i==n)
                break;
        	if(c[i]==0)
        		e--;
        	else
        		e=e-3;
            if(i>=n-k)
        		break;
        	
        }
        if(c[0]==0)
        System.out.println(e-1);
        else
        System.out.println(e-3);
    }
}