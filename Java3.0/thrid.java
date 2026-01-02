// public class thrid 
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {10,20,30,40,50};

//         for(int i =0;i<arr.length;i++)
//         {
//             if(i%2 == 0)
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {10,20,30,20,10};
//         int n = arr.length;
//         Boolean res = true;
        
//         for(int i =0;i<=arr.length/2;i++)
//         {
//             if(arr[i] != arr[n-1-i])
//             {
//                 res = false;
//                 break;
//             }

//         }

//         System.out.println(res);
//     }
// }

// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         String str = "G F GFG";
//         char[] arr = str.toCharArray();

//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i] == ' ')
//             {
//                 continue;
//             }
//             else
//             {
//                 System.out.print(arr[i]);
//             }
//         }

//     }
// }

// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         int num = 56;
//         int sum = 0;
//         while(num!=0)
//         {
//             int n = num%10;
//             sum+= n;
//             num = num/10;
//         }
//         System.out.println(sum);
//         int save = sum;


//         int a;
//         int res =0;

//         while(sum!=0)
//         {
//             a = sum%10;
//             res = res*10 + a;
//             sum = sum/10;
//         }

//         System.out.println(res);


//         if(save == res)
//         {
//             System.out.println("true");
//         }
//         else 
//         {
//             System.out.println("false");
//         }

        
//     }
// }


// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         int num = 5;
//         for(int i =1 ;i<11;i++)
//         {
//             System.out.println(i*num);
//         }
//     }
// }


// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         int num = 5;
//         for(int i =1 ;i<11;i++)
//         {
//             System.out.println(num + " * " +i + " = " + (num * i) );
//         }
//     }
// }


// public class thrid
// {

//     public static void main(String[] args) 
//     {
//         String s = "ckjkUUYII";
//         int count =0;

//         for(int i = 0;i<s.length();i++)
//         {
//             if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
//             {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

// import java.util.ArrayList;
// import java.util.Collection;

// public class thrid
// {
//     public static void main(String[] args) 
//     {
//         ArrayList<Integer> abc = new ArrayList<>();
//         abc.add(10);
//         abc.add(20);
//         abc.add(30);
//         abc.add(40);
//         abc.add(50);

//         String str = abc.toString();
//         System.out.println(str);

        

//     }
// }

// import java.util.Collection;
// import java.util.HashSet;

// public class thrid 
// {
//     public static void main(String[] args) 
//     {
//         String str = "geeksforgeeks";

//         HashSet<Character> hs = new HashSet<>();
//         for(int i=0;i<str.length();i++)
//         {
//             hs.add(str.charAt(i));
            
//         }
//         System.out.println(hs.size());
//     }
// }

import java.util.Collection;
import java.util.HashMap;

public class thrid
{
    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";

        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i =0;i<str.length();i++)
        {
            hm.put(str.charAt(i), null);
        }
    }
}