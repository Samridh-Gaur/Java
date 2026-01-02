import java.util.ArrayList;
class Fabonacii
{
    public static void main(String[] args) 
    {
        int first = 0;
        int second = 1;

        int n = 10;

        for(int i =0;i<n;i++)
        {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}

public class practice {
    public static void main(String[] args) {
        String s = "this is java mock";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // Logic: Capitalize if it's the first char OR if the previous char was a space
            if (i == 0 || arr[i - 1] == ' ') {
                
                // Only subtract 32 if the character is currently lowercase
                if (arr[i] >= 'a' && arr[i] <= 'z') {
                    arr[i] = (char) (arr[i] - 32);
                }
            }
        }

        // Convert the character array back to a String to print
        String result = new String(arr);
        System.out.println(result);
    }
}