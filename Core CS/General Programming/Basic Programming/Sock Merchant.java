import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
            int i=0,x=0;
            Arrays.sort(c);
            while(i<n-1)
                {
                if(c[i]==c[i+1])
                    {
                    x++;
                    i=i+2;
                }
                else
                    {
                    i++;
                }
            }
            System.out.println(x);
        }
    }
