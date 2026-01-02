public class natural 
{
    // public static void main(String[] args) 
    // {
    //     int n = 7;
    //     int sum =0;                                     //sum of n natural numbers

    //     for (int i =1;i<=n;i++)
    //     {
    //         sum += i; 
    //     }

    //     System.out.println(sum);
    // }


    // public static void main(String[] args) 
    // {
    //     int n = 5;
    //     int sum = 1;
        
    //     while(n>0)
    //     {                                                // fabonacci
    //         sum *= n;
    //         n--;
    //     }

    //     System.out.println(sum);
    // }

    // public static void main(String[] args) 
    // {
    //     int n = 10;

    //     for(int i =2;i<=n;i++)
    //     {
    //         boolean isPrime = true;                      // Prime or not

    //         for(int j =2;j<=Math.sqrt(i);j++)
    //         {
    //             if(i%j == 0)
    //             {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }

    //         if(isPrime)
    //         {
    //             System.out.println(i + " ");
    //         }
    //     }
    // }


    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,5};
        int max = arr[0];
        int sum = 0;
        
        for (int i : arr) 
        {
            
            if(i > max)
            {                                               // Missing number in an array
                max = i;
            }
            sum+= i;
        }
        
        int sum2 = (max * (max+1))/2;

        int ans = sum2-sum;
        System.out.println(ans);
    }
}
