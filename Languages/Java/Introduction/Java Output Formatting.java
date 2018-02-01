import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1=sc.next();
                int x=sc.nextInt();
                if(x<=9)
                 {   
                   System.out.printf("%-14s 00%d \n",s1,x);
                }
                    else if(x<=99)
                    {
                        System.out.printf("%-14s 0%d \n",s1,x);
                    }
                        else if(x<=999)
                    {
                        System.out.printf("%-14s %d \n",s1,x);
                     }
                            //Complete this line
            }
            System.out.println("================================");

    }
}