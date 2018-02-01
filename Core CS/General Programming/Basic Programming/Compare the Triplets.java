import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b=0,c=0;
        if(a0>b0) 
             b++;
        if(a1>b1)
        		b++;
        if(a2>b2)
        	b++;
        if(a0<b0)
             c++;
        if(a1<b1)
        	c++;
        if(a2<b2)
        	c++;
            System.out.print(b+" ");
            System.out.print(c);
    }
}