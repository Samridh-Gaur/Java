// class bike
// {
//     void run()
//     {
//         System.out.println("this is a bike");
//     }
// }

// class sp extends bike
// {
//     void run()
//     {
//         System.out.println("sp bike");
//     }
// }

// public class Assignment12 
// {
//     public static void main(String[] args) 
//     {
//         bike abc = new sp();  // Upcasting
//         abc.run();
//     }
// }

// class bank
// {
//     private int balance = 100000;

//     void deposit(int x)
//     {
//         balance += x;
//     }

//     void CB()
//     {
//         System.out.println(balance);
//     }
// }


class roshit
{
    void r()
    {
        System.out.println("Hi brother");
    }
}

class samridh extends roshit
{
    void r()
    {
        System.out.println("bhai ha tu");
    }
}

public class Assignment12 
{
    public static void main(String[] args) 
    {
        samridh abc = new samridh();
        abc.r();
    }
}
