import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();
        String hh= time.substring(0,2);
        String mm= time.substring(3,5);
        String ss= time.substring(6,8);
        String pp= time.substring(8,10);

        int hr=Integer.parseInt(hh);
        int min=Integer.parseInt(mm);
        int sec=Integer.parseInt(ss);

    if (pp.equals("AM") || pp.equals("am") )
      { if(hr == 12)
            hr = 0;
            }  


    else if(pp.equals("PM") || pp.equals("pm"))  {

        hr = hr + 12;
        if(hr==24) hr= 12;
        }


    System.out.printf("%02d:%02d:%02d",hr,min,sec);  


}
}