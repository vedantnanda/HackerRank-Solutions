import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try
        {
            int s=Integer.parseInt(S);
            System.out.println(s);
        }catch(Exception ee)
        {
            System.out.println("Bad String");
        }
    }
}