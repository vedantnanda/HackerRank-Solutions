import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int i=0,a=0,b=0;;
        int max=score[i];
        int min=score[i];
        for(i=0;i<n;i++)
            {
            if(score[i]>max)
               { max=score[i];
                a++;
               }
            if(score[i]<min)
                {
                min=score[i];
                b++;
            }
        }
        System.out.println(a+" "+b);
        // your code goes here
    }
}