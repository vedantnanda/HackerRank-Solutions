import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int count = 0;
        int n = in.nextInt();
        int l=n;
        int[] a=new int[20];
        int i=0;
        while(n>0)
        {
        	a[i]=n%10;
        	n=n/10;
        	i++;
        }
        for(int j=0;j<20;j++)
        {
        	if((a[j]!=0) && (l%a[j]==0))
        	count++;
        }
         System.out.println(count); 
    }
    in.close();
}
}