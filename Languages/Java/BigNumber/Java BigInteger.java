import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        BigInteger c=a.add(b);
         BigInteger d=a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}