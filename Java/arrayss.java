import java.util.Arrays;
import java.util.Scanner;


public class arrayss 
{

    // static boolean isPrime(int n)
    // {
    //     if(n<=1)
    //     {
    //         return false;
    //     }

    //     for(int i=2;i<n;i++)
    //     {
    //         if(n % i == 0)
    //         {
    //             return false;
    //         }
    //     }

    //     return true;
    // }


    public static void main(String[] args) 
    {


        // int[] arr = {1 , 2 , 3};
        // for (int i : arr) 
        // {
        //     System.out.print(i);
        // }


         
        // 2. Write a Java program that:
        // Takes a static array of integers as input.
        // Prints whether the given number exists in the array or not.

        // int[] arr = {10,20,30};
        // int num = 1;
        // boolean b = false;

        // for (int i : arr) {
        //     if (i == num) 
        //     {
        //            b = true;
        //     }

        // }

        // System.out.println(b);

        // 3. Write a Java program that:
        // Declares a static integer array of 6 elements.
        // Sorts the array in ascending order.
        // Reverses the sorted array and prints both results.

        // int[] arr = {20,30,10,50,40};
        // int size = arr.length;
        // Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // System.out.println();

        // for(int j =size-1; j>=0;j--)
        // {
        //     System.out.print(arr[j]+" ");
        // }


        // 4. Write a Java program that:
        // Declares and initialises a 3×3 2D array with sample values.
        // Prints the matrix in a structured format.

        // int[][] arr = new int[3][3];
        // arr[0] = new int[]{1,2,3};
        // arr[1] = new int[]{4,5,6};
        // arr[2] = new int[]{7,8,9};

        // for (int[] row : arr) 
        // {
        //     for (int value : row) 
        //     {
        //         System.out.print(value);
        //     }
        //     System.out.println();
        // }



        // 5. Write a Java program that:
        // Takes a 3×3 2D array as input.
        // Computes and prints the sum of all elements in the array.

        
        // int[][] arr = new int[3][3];
        // arr[0] = new int[]{1,1,1};
        // arr[1] = new int[]{1,1,1};
        // arr[2] = new int[]{1,1,1};
        // int sum = 0;

        // for (int[] rows : arr) 
        // {
        //     for (int value : rows) 
        //     {
        //         sum += value;
        //     }
        // }

        // System.out.println(sum);




        // 6. Write a Java program that:
        // Reads a 3×3 2D array from user input.
        // Finds the row with the highest sum and print that row.



        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println();


        // 7. Write a Java program that:
        // Takes an integer input from the user.
        // Check if the number is prime or not.
        // Clearly explains how the 6-step strategy was used to solve this problem

        // Scanner sc = new Scanner(System.in);
        // System.out.println("please enter a number to check prime :- ");
        // int num = sc.nextInt();

        // boolean ans = isPrime(num);
        // System.out.println(ans);
        // sc.close();




        // 8. Write a Java program that:
        // Declares a static array of 5 integers.
        // Performs addition, subtraction, multiplication, and division on all elements and prints the results.

        // int[] arr = {10,20,30,40,50};
        // for (int i : arr) 
        // {
        //     System.out.println(i+10);
        // }
    }
}

