public class first 
{


    public static String fun(int num)
    {
        if(num == 0)
        {
            return "number is zero";
        }

        if(num%2 == 0)
        {
            return "Even";
        }
        
        else{return "Odd";}
    }


    public static void main(String[] args) 
    {
        System.out.println(fun(256));
    }    
}
