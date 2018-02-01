import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n=S.length();
        char[] ch=S.toCharArray();
        int c=0;
        for(int i=0;i<n;i=i+3)
            {
            if( ((int)ch[i]!=83))
                c++;
            if(((int)ch[i+1]!=79))
                c++;
            if(((int)ch[i+2]!=83))
                c++;
        }
        System.out.println(c);
    }
}