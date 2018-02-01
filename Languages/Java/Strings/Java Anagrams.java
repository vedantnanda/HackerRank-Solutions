static boolean isAnagram(String a, String b) 
    {
    	String a1=a.toLowerCase();
    	String b1=b.toLowerCase();
    	char [] ch1=a1.toCharArray();
    	char [] ch2=b1.toCharArray();
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	String A=new String(ch1);
    	String B=new String(ch2);
    	if(A.compareTo(B)!=0)
    	{
    		return false;
    	}
    	else
    	{
        return true;
    	}
        // Complete the function by writing your code here.
        
    }