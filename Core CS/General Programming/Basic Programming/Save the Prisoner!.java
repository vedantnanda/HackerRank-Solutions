import java.io.*;
import java.util.*;

public class Solution
{
   public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    for (int i = 0;i< n;i++){
	         int j = scan.nextInt();//number of prisoners
	        int h = scan.nextInt();//number of sweets
	        int k = scan.nextInt();//id of prisoner
	        //initializing prisoner array
	        if (h == 1){
	             System.out.println(""+(k));
	        }
	        else{
	        while(h > 1){
	            if (k >=j){
	                k = 1;
	                h=h-1;
	            }
	            else{
	         k = k+1;
	         h = h-1;
	            }
	        }
	        System.out.println(""+(k));
	        }        }
	}
}