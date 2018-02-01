
import java.util.*;


public class hr_test1 {

    static String super_reduced_string(String s){
        for(int j=0;j<=100;j++){
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                String b=s.substring(i,i+2);
                //System.out.println("b= "+b);
                s = s.replaceAll(b,"");
            }
        }
        }
        try
        {
        if(s.charAt(0)<(char)64)
        { 
        }
        }catch(Exception ee)
        {
            s="Empty String";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}