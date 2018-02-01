import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter no: ");
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++)
        {
            int grade = in.nextInt();
            if(grade%5==0)
            {
            	System.out.println(grade);
            }
            else if(grade>=38)
            {
            	int g1=grade;
            	while(grade%5!=0)
            	{
            		grade++;
            		//System.out.println("grade: "+grade);
            	}
            	if(grade-g1<3)
            	{
            		System.out.println(grade);
            	}
            	else
            	{
            		System.out.println(g1);
            	}
            }
            else if(grade<38)
            {
            	System.out.println(grade);
            }
        }
        
    }
}