public class Reverse 
{

    void numrev(int a)
    {  
        int reversed =0;
        while(a!=0)
        {
            int digit = a%10;
            a = a/10;
            reversed = reversed*10 + digit;
        }
        
        System.out.println(reversed);
    }

    public static void main(String[] args) 
    {
        Reverse abc = new Reverse();
        abc.numrev(1000);
    }
}
