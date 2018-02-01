import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int i,p=0;
        int[] u = new int[word.length()];
        for(i=0;i<word.length();i++)
        {
        	int x=(int)word.charAt(i);
        	//System.out.println("x: "+x);
        	int y=x-97;
        	u[p]=word.length()*h[y];
        	p++;
        }
        Arrays.sort(u);
        System.out.println(u[word.length()-1]);
    }
}