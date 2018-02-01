import java.io.*;
import java.util.*;

public class Solution{

    static int minSteps(int n, String B)
    {
    	int i,count=0;
    	String A=B;
        for(i=0;i<n;i++)
        {
        	if(i>n-3)
        		break;
        	A=B.substring(i,i+3);
          	if(A.charAt(0)=='0' && A.charAt(1)=='1' && A.charAt(2)=='0' )
        	{
        		count++;
        		//System.out.print(" count= "+count+"\n");
        		i=i+2;
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}