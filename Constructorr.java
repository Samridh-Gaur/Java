 public class Constructorr
{

    Constructorr()
    {
        System.out.println("Kans hi kaha da");
    }

    Constructorr(int a , int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) 
    {
        Constructorr abc2 = new Constructorr(10,20);
        Constructorr abc1 = new Constructorr();
       
    }
}

class child extends Constructorr
{

    child()
    {
        // super(10,20);
        this(10,5);
    }

    child(int a,int b)
    {
        System.out.println(b-a);
    }
   public static void main(String[] args) 
   {
        Constructorr cobj = new child();
   }

   

}
