import java.io.*;
import java.util.*;

public class Solution {

    static long taumBday(long b, long w, long x, long y, long z) {
        // Complete this function
        long total=0;
        if(x<(y+z))
        {
            total=x*b;
            //System.out.println("x= "+x+"b= "+b+" total1: "+total);
        }
        else 
        {
            total=(y+z)*b;
            //System.out.println("total2: "+total);
        }
        if(y<(x+z))
        { 
            total+=w*y;
            //System.out.println("total3: "+total);
        }
        else
        {
            total+=w*(x+z);
           // System.out.println("total4: "+total);
        }  
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }
}