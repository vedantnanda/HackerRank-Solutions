import java.util.*;
public class Solution{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		if(n==0)
			{
			System.out.println("1");
			System.exit(0);
			}
		String s=Long.toBinaryString(n);
		sc.close();
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				count++;
			//	System.out.println("count= "+count);
			}
		}
		System.out.println((long)Math.pow(2, count));
	}
}