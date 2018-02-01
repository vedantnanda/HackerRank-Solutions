import java.io.*;
import java.util.*;

public class Solution {

    static int chocolateFeast(int n, int c, int m) {
        // Complete this function        
        int initchoc=(int)(n/c);
        int wrapper=initchoc;
        int wrapchoc;
        while(wrapper>=m)
        {
            wrapchoc=(int)(wrapper/m);
            initchoc=initchoc+wrapchoc;
            wrapper=(wrapper%m)+wrapchoc;
        }
        return initchoc;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}