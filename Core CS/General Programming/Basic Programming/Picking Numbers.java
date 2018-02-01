import java.util.*;


public class Solution 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);      
      int terms = scan.nextInt();
        int[] number = new int[terms];
        int max=0;                      
        
        for(int i=0; i < terms; i++)
        {
            number[i] = scan.nextInt();
        }
        Arrays.sort(number);                               
        for(int i=0 ; i < terms-1;i++)
        {   
            if(number[i]==0)                                   {                                                      continue;                          
            }                                      
                                                   
            
            if(number[i+1]-number[i]<=1)           
            {                                      
                int count=0;                       
                for(int j = i; j < terms; j++)
                {    
                    
                    if(number[i]==number[j])
                    {
                        
                        count++;
                        
                        if(i!=j)                  
                        {                         
                            number[j]=0;          
                        }

                        continue;
                    }
                    
                    if(number[i]+1==number[j])   
                    {
                        count++;
                        continue;
                    }    
                    
                    
                        break;                  
                                                
                }                               
                                                
                if(count>max)
                {
                        max=count;              
                }
            }    
        }
        
        System.out.println(max);
    }
}