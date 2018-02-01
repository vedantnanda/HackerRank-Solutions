import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long []a = new long[5];
        for(int i=0;i<5;i++)
            {
            a[i]=in.nextLong();
        }
        Arrays.sort(a);
        long sum1=a[0]+a[1]+a[2]+a[3];
        long sum2=a[1]+a[2]+a[3]+a[4];
        System.out.println(sum1+" "+sum2);
    }
}