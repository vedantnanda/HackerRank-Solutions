import java.io.*;
import java.util.*;
public class Solution
{
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int val=0;
        int count=0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == 'D') {
                val--;
            } else if(s.charAt(i) == 'U' && val == -1) {
                val++;
                count++;
            } else {
                val++;
            }
        }
        
        System.out.println(count);
    }
}