import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int p=0;p<r;p++)
            {
                long a=sc.nextLong();
                long b=sc.nextLong();
                int count=0;
                long sq[]=new long[31624];
                for(int i=0;i<=31623;i++)
                    {
                        sq[i]=(long)Math.pow(i,2);
                        if(sq[i]>=a && sq[i]<=b)
                            {
                                count++;
                                //System.out.println("sq[i]= "+sq[i]+" count= "+count);
                             }
                    }
                System.out.println(count);
        }
        sc.close();
    }
}