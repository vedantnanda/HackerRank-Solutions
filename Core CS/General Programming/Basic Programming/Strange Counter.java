import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long reset = 1;
       
        while(reset<=t)
        { 
            reset = reset * 2 + 2;
        }
       
        System.out.println(reset-t);
    }
}