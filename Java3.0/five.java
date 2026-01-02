// import java.util.ArrayList;
// import java.util.Scanner;

// public class five 
// {
//     public static void main(String[] args) 
//     {

//         Scanner abc = new Scanner(System.in);
//         System.out.println("enter int");
//         int a = abc.nextInt();
//         abc.nextLine();
//         System.out.println("enter char");
//         String b = abc.nextLine();
//         abc.close();
//         System.out.println(a + b);
        
//     }    
// }

// public class five
// {

//     public static void main(String[] args) 
//     {

        
//         String str = "samridh";
//         char[] arr = str.toCharArray();

//         for(int i=arr.length-1; i>=0;i--)
//         {
//             System.out.print(arr[i]);
//         }




//         int num = 12345;
//         int res = 0;

//         while(num!=0)
//         {
//             int temp = num%10;
//             res = res*10 + temp;
//             num = num/10;
//         }
//         System.out.println(res); 
//     }
// }

// public class five
// {

//     public static void main()
//     {
//         System.out.println("papa");
//     }
//     public static void main(String[] args) 
//     {
//         System.out.println("abc");
//         five.main();
//     }

// }

// import java.util.HashMap;

// public class five
// {
//     public static void main(String[] args) 
//     {
//         String s1 = "geeksforgeeks";
//         String s2 = "geeksquiz";

//         HashMap<Character , Integer> hm = new HashMap<>();

//         for(int i =0;i<s1.length();i++)
//         {
//             hm.put(s1.charAt(i), 1);
//         }

//         for(int i =0;i<s2.length();i++)
//         {
//             if(hm.containsKey(s2.charAt(i)))
//             {
//                 continue;
//             }
//             else
//             {
//                 System.out.println(s2.charAt(i));
//             }
//         }



//         HashMap<Character , Integer> hm2 = new HashMap<>();

//         for(int i =0;i<s2.length();i++)
//         {
//             hm2.put(s2.charAt(i), 1);
//         }

//         for(int i =0;i<s1.length();i++)
//         {
//             if(hm2.containsKey(s1.charAt(i)))
//             {
//                 continue;
//             }
//             else
//             {
//                 System.out.println(s1.charAt(i));
//             }
//         }
//     }
// }

public class five
{
    public static void main(String[] args) 
    {
        String s = "aabccba";

        for(int i=0;i<s.length();i++)
        {
            if(i ==0 || s.charAt(i) != s.charAt(i-1))
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}