import java.util.Scanner;
import java.math.BigInteger;
public class Solution{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            {
                long a=sc.nextLong();
                long max=(long)Math.pow(2,32)-1;
                System.out.println(max^a);
            }
    }
}