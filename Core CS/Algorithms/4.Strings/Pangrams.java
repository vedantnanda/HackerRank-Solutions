import java.io.*;
import java.util.*;


public class Solution {
   
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String input=new String(sc.nextLine());
        
        input = input.replaceAll("\\s+","");
        input=input.toLowerCase();
        
        char[] ch1=new char[input.length()];
        ch1=input.toCharArray();
        Arrays.sort(ch1);
        
        boolean chk=false;
        int i=1,count=1;
        
        for(i=1;i<ch1.length;i++)
        {
            if(ch1[0]!='a'||count==26)
            {i=ch1.length;break;}
            if(ch1[i]-ch1[i-1]>1)
                break;
            else if(ch1[i]-ch1[i-1]==1)
                count++;  
        }
        if(count==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}