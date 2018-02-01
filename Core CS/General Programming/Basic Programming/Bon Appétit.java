import java.io.*;
import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []c=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+c[i];
		}
		sum=(sum-c[k])/2;
		int p=sc.nextInt();
		if(sum==p)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(Math.abs(p-sum));
		}
		sc.close();
	}

}