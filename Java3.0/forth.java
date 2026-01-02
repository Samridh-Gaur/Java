// import java.util.HashMap;

// public class forth
// {
//     public static void main(String[] args) 
//     {
//         String s = "apple pie";

//         HashMap<Character,Integer> hm = new HashMap<>();

//         for(int i =0;i<s.length();i++)
//         {
//             if(hm.containsKey(s.charAt(i)))
//             {
//                 hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1 );
//             }

//             else
//             {
//                 hm.put(s.charAt(i), 1 );
//             }
//         }
//         System.out.println(hm);
//     }
// }

// public class forth
// {
//     public static void main(String[] args) 
//     {
//         int n =2;
//         int num = 1;
//         int gap = 2;
        
//         for(int i=2;i<=n;i++)
//         {
//             num = num + gap;
//             gap = gap +1;
//         }

//         System.out.println(num);
//     }
// }

// public class forth
// {
//     public static void main(String[] args) 
//     {
//         String str = "1Hello2   &* how  are y5ou";

//         for(int i=0;i<str.length();i++)
//         {
//             if(str.charAt(i) >= '0' && str.charAt(i) <='9')
//             {
//                 System.out.println(str.charAt(i));
//             }
//         }
//     }
// }


// public class forth
// {
//     public static void main(String[] args) 
//     {
//         String[] arr = {"GeeksforGeeks", "FreeCodeCamp", "StackOverFlow",  "MyCodeSchool"};
//         int lenght = arr[0].length();

//         for (String string : arr) 
//         {
//             if(string.length() > lenght)
//             {
//                 lenght = string.length();
//             }
//         }

//         for (String string : arr) 
//         {
//             if(string.length() == lenght)
//             {
//                 System.out.println(string);
//             }
//         }
        
//     }
// }

// public class forth
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         int f = arr[0];
//         int s = -1;

//         for (int i : arr) 
//         {
//             if(f < i)
//             {
//                 s = f;
//                 f = i;
//             }

//             else if(f > i && s<i)
//             {
//                 s = i;
//             }
//         }
//         System.out.println(s);
//     }
// }

import java.util.Collections;
import java.util.HashMap;

public class forth
{
    public static void main(String[] args) 
    {
        String str = "apple pie";
        char ans = 0;
        int count = 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(hm.containsKey(str.charAt(i)))
            {
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
                if(hm.get(str.charAt(i)) > count)
                {
                    count = hm.get(str.charAt(i));
                    ans = str.charAt(i);
                }
            }

            else
            {
                hm.put(str.charAt(i), 1);
            }
        }

        System.out.println(ans);
        System.out.println(count);
        
    }
}