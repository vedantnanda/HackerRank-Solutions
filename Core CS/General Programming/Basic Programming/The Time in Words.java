import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        //String[] hour=new String[12];
        String[] hour={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String[] min={"one minute", "two minutes", "three minutes", "four minutes", "five minutes", "six minutes", "seven minutes", "eight minutes", "nine minutes", "ten minutes", 
                "eleven minutes", "twelve minutes", "thirteen minutes", "fourteen minutes", "fifteen minutes", 
                "sixteen minutes", "seventeen minutes", "eighteen minutes", "ninteen minutes", "twenty minutes",
                "twenty one minutes", "twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes", 
                "twenty six minutes", "twenty seven minutes", "twenty eight minutes", "twenty nine minutes"};
        String a="",b="",c="";
        if(m==0)
        a=hour[h-1];
        else if(m<=30)
            a=hour[h-1];
            else
            a=hour[h];
        if(m==0)
        		{b="";
        		c="o' clock";
        		}
        else if(m==45)
        {System.out.println("quarter to "+a);System.exit(0);}
        else if(m==15)
            {System.out.println("quarter past "+a);System.exit(0);}
        else if(m<30)
        {b=" past";c=min[m-1];}
        else if(m>30)
        	{b=" to";c=min[(60-m)-1];}
        else if(m==30)
        {c="";b="half past";}
        if(m==0)
            System.out.println(a+" "+c);
        else
        System.out.println(c+b+" "+a);
        
    }
}