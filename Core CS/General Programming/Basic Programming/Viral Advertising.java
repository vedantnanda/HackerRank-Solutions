import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,people=5;
        for(int i=0;i<n;i++)
        {
            int send=people/2;
            people=send*3;
            count=count+send;
        }
        System.out.println(count);
    }
}