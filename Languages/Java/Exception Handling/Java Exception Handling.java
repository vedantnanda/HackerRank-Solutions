//Write your code here
class MyCalculator
{
    public String power(int n,int p)
    {
        try{
            if(n<0 || p<0)
                throw new Exception();
            else
                return (Long.toString((long)Math.pow(n,p)));
        }catch(Exception ee)
        {
            return ("java.lang.Exception: n and p should be non-negative");
        }
            
    }
}