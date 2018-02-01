
import java.util.*;
public class Solution{
       
          static void partition(int[] a) 
          {
        	  final int[] distinct=Arrays.stream(a).distinct().toArray();
        	  int pivot=distinct[0];
        	  int n=distinct.length;
        	  int sort[]=new int[n];
        	  int i,c=0;
        	  for(i=0;i<n;i++)
        	  {
        		  if(distinct[i]<pivot)
        			  {sort[c]=distinct[i];c++;}
        	  }
        	  sort[c]=pivot;
                int j=c+1;
              for(i=0;i<n;i++)
        	  {
        		  if(distinct[i]>pivot)
        			  {sort[j]=distinct[i];j++;}
        	  } 
                    printArray(sort);
          }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           } 
           in.close();
           partition(ar);
       }    
}
	