import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int n=(numberNeeded(a, b));
        System.out.println(n);
    }
    public static int numberNeeded(String first, String second) {
        
        char []a1 = first.toCharArray();
        char []a2 = second.toCharArray();
        int count = 0; 
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==(a2[j])){
                    count++;
                    a1[i] = 0;
                    a2[j] = 0;
                    break;
                }
            }
        }
        int a = a1.length - count;
        int b = a2.length - count;
        return a+b;
    }
    
}