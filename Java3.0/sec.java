// // public class sec 
// // {
// //     public static void main(String[] args) 
// //     {
// //         // int a = 10;
// //         // int b = 20;
// //         // int c;

// //         // c = a;
// //         // a = b;
// //         // b = c;

// //         // System.out.println(a);
// //         // System.out.println(b);


// //         int a = 10;
// //         int b = 20;
// //         int c;


// //         a = a^b;
// //         b = a^b;
// //         a = a^b;

// //         System.out.println(a);
// //         System.out.println(b);
// //     }
// // }


// public class sec
// {
//     public static void main(String[] args) 
//     {
//         int num = 167;
//         int sum = 0;

//         while(num != 0)
//         {
//             sum += num%10;
//             num = num/10;
//         }

//         System.out.println(sum);
//     }
// }


// public class sec
// {
//     public static void main(String[] args) 
//     {
//         int[][] arr = {{1,2,3} , {9,8,7}};
//         int sum = 0;

//         for (int[] is : arr) 
//         {
//             for (int is2 : is) 
//             {
//                 sum += is2;  
//             }
//         }

//         System.out.println(sum);
//     }
// }


// public class sec
// {
//     public static void main(String[] args) 
//     {
//         String str = "Samridh Gaur";
//         char[] ch = str.toCharArray();


//         for(int i =0;i<ch.length;i++)
//         {
//             if(ch[i]>= 'a' && ch[i] <= 'z')
//             {
//                 ch[i] = (char) (ch[i] - 32);
//             }
//         }

//         String res = new String(ch);
//         System.out.println(res);
//     }
// }



// public class sec
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {10,20,30,11,29};
//         int oddSum = 0;
//         int evenSum =0;

//         for(int i =0;i<arr.length;i++)
//         {
//             if(arr[i]%2 == 0)
//             {
//                 evenSum += arr[i];
//             }
            
//             else
//             {
//                 oddSum += arr[i];
//             }
//         }

//         System.out.println("Even Sum = " + evenSum);
//         System.out.println("Odd Sum = " + oddSum);
//     }
// }