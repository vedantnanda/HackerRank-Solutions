import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        int t=0;
        int n=0;
        int h=1;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            h=1;
            n=sc.nextInt();
              if(n==0)h=1;
            for(int a=1;a<=n;a++){
               
            if(a%2!=0 )h*=2;
            if(a%2==0  )h+=1;
            }
           
            System.out.println(h);
            
        }
   }
}