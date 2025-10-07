public class First
{
    static int a = 99; //This is the static variable
    public static void main(String[] args) 
    {
       System.out.println("Your number is " +First.a);
       a = 200;
       System.out.println("Now the number is " +First.a);
    }
}

class Second
{
    int a = 100; //This is the instance variable

    public static void main(String[] args) 
    {
        First abc = new First();
        System.out.println("Interest is " +abc.a);
    }
}

class third
{
    static boolean a;

    public static void main(String[] args) {
        System.out.println(third.a);
    }
}


