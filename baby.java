// class person
// {
//     void alive()
//     {
//         System.out.println("i am alive");
//     }
// }

// interface student
// {
//     void stu();

// }

// public class baby extends person implements student
// {
//     public void stu()
//     {
//         System.out.println("Student here");
//     }

//     public static void main(String[] args) 
//     {
//         baby b = new baby();
//         b.alive();
//         b.stu(); 


//     }

// }


// // public class Assignment11 
// // {
// //     int roshit = 99;
// //     public static void main(String[] args) 
// //     {
// //         student std = new student();
// //         std.age = 10;
// //         System.out.println(std.age);
// //         student std1 = new student();
// //         System.out.println(std.age);


// //     }
// // }



class samridh
{
    samridh()
    {
        System.out.println("samridh constructor");
    }
}

class samarth extends samridh
{
    public static void main(String[] args) 
    {
        samarth sam = new samarth();
        System.out.println("main class of samarth");
    }
}