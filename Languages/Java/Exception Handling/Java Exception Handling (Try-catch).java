import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        try{
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            /*if(y==0)
                throw new Exception();*/
            System.out.println(x/y);
        }catch(InputMismatchException ee)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}