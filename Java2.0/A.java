    // class A
    // {
    //     protected void display()
    //     {
    //         System.out.println("protected access");
    //     }
    // }


    // public class B extends A
    // {
    //     public static void main(String[] args) 
    //     {
    //         B obj = new B();
    //         obj.display();
           
    //     }
    // }
    // // public static void main(String[] args) 
    // // {
        
    // //     // Assignment10.hello();
    // //     // Assignment10.ans = 909;
    // //     // pak abc = new pak();
    // //     // System.out.println(ans);


    // // }


public class A
{
    static int a = 10;
}

class B extends A
{
    public static void main(String[] args) 
    {
        A a1 = new A();
        A a2 = new A();
        a1.a = 20;
        System.out.println(a2.a);
        System.out.println(a1.a);
    }
}