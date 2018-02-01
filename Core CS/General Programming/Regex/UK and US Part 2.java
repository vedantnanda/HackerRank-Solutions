import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Demo1 {

    public static void main(String[] args) throws IOException 
    {
    	InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);
        int n=Integer.parseInt(br.readLine());
        String[] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=br.readLine();
        }
        int m=Integer.parseInt(br.readLine());
        String[] reg=new String[m];
        for(int j=0;j<m;j++)
        {
            reg[j]=br.readLine();
        }
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                String in=s[j]+" ";
                String im=reg[i];
                if(im.endsWith("oury"))
                    im=im.replace("oury","ou?ry");
                else if(im.endsWith("our"))
                    im=im.replace("our","ou?r ");
                else
                    im=im.replace("our","ou?r");
                Pattern p=Pattern.compile(im);
			    Matcher q=p.matcher(in);
			    while(q.find())
			     {
                    count++;
                 }
            }
            System.out.println(count);
        }
    }
}