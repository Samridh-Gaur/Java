public class binary 
{
    
    public static boolean isBinary (int a)
    {
        if(a<=1)
        {
            return false;
        }

        
        
        while(a != 0)
        {
            if(a%10 > 1)
            {
                return false;
            }

            a = a/10;
        }
        
        
        
        return true;


    }
    
    
    
    public static void main(String[] args) 
    {
        System.out.println(isBinary(1010));
    }
}
