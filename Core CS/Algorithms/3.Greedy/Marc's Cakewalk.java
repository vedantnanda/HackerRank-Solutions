import java.util.*;


public class Solution{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++)
        {
            calories[calories_i] = in.nextInt();
        }
        in.close();
        Arrays.sort(calories);
        long count=0,j=0;
        for(int i=n-1;i>=0;i--)
        {
        	count=(long) (count+ ( calories[i] * Math.pow(2, j) ) );
        	j++;
        }
        System.out.println(count);
    }
}