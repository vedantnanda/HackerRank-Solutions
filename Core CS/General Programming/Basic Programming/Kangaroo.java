import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(x2>x1 && v2>v1)
            System.out.println("NO");
        else
            for(int i=0;i<10000;i++)
            {
            int x=x1+v1*i;
            int y=x2+v2*i;
            if(x==y)
            {System.out.println("YES");break;}
            if(i==9999)
                System.out.println("NO");
        }
    }
}