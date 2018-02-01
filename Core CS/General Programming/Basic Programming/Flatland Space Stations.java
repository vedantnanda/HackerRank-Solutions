import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        int distance = 0;
        for (int i = 0; i < n; i ++){
            int temp = Math.abs(i - c[0]);
            //System.out.print("temp= "+temp+" ");
            for (int j = 0; j < m; j++){
                temp = Math.min(temp, Math.abs(i - c[j]));
               // System.out.print("i= "+i+" c[j]= "+c[j]+" ");
                //System.out.print("temp2= "+temp+" ");
            }
            distance = Math.max(distance, temp);
            //System.out.println("distance= "+distance);
        }
        System.out.println(distance);           
    }
}