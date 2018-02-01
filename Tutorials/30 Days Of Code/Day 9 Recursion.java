import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         
        System.out.println(factorial(n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

static int factorial(int n)
    {
    if(n<=1)
        return(n);
    else
        return(n*factorial(n-1));
}
}