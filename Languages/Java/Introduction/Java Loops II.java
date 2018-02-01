import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a;
            double k=Math.pow(2,n);
            for(int j=1;j<k;j=j*2)
                {
                
                s=s+(j*b);
                System.out.print(s+" ");
            } 
            if(i!=t)
                {
                System.out.print("\n");
            }
            else
                {
                break;
            }
            
        }
        //in.close();
    }
}
