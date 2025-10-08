import java.util.Arrays;

public class stringss {

    public static void main(String[] args) 
    {
        // Write a Java program to check if two strings are equal using == and .equals().
        // String str1 = new String ("hello");
        // String str2 = "hello";
        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2));


        // Write a program to compare two strings lexicographically using .compareTo().
        // String str1 = new String ("hello");
        // String str2 = "hello";
        // System.out.println(str1.compareTo(str2));


        // Write a program to check if a given string is a palindrome.
        // String str = "123321";
        // boolean ispalindrome = true;

        // for(int i=0;i<str.length()/2;i++)
        // {
        //     if(str.charAt(i) != str.charAt(str.length() -1 - i))
        //     {
        //         ispalindrome = false;
        //         break;
        //     }
        // }
        
        // if(ispalindrome)
        // {
        //     System.out.println("it is a palindrom");
        // }

        // else
        // {
        //     System.out.println("sorry it is not a palindrom");
        // }


        // Write a program to find the number of vowels and consonants in a given string.
        // String str = "abcde";
        // int isVovel = 0;
        // int isConsonent = 0;

        // for(int i=0;i<str.length();i++)
        // {
        //     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u')
        //     {
        //         isVovel++;
        //     }

        //     else
        //     {
        //         isConsonent++;
        //     }
        // }

        // System.out.println(isVovel);
        // System.out.println(isConsonent);


        
        // Write a program that checks if one string is a rotation of another (e.g., "abcd" and "cdab").

        // String s1 = "abcd";
        // String s2 = "dabca";
        // String s3 = s1 + s1;

        // if (s1.length() == s2.length())
        // {
        //     System.out.println(s3.contains(s2));
        // }
        



        // Write a program where one string is created using a literal and another using new String(). Compare them using ==.

        // String s1 ="hello";
        // String s2 = new String("hello");
        // System.out.println((s1) == (s2));



        // Write a program to convert an integer, double, and boolean into strings using String.valueOf().

        // int i = 10;
        // String s1 = String.valueOf(i);
        // System.out.println(s1);

        // boolean b = true;
        // String s2 = String.valueOf(b);
        // System.out.println(s2);


        // Write a program to convert a string containing a number into an integer, float, and double.

        // String s1 = "999";
        // int i = Integer.parseInt(s1);
        // System.out.println(i);



        // Write a program to convert a character array into a string and vice versa.
        // int[] arr = {1 , 2 , 3 , 4 , 5};
        // String s = Arrays.toString(arr);
        // System.out.println(s);
        // char[] s1 = s.toCharArray();
        // System.out.println(s1);


        // // Write a program to extract a substring from a given string.
        // String s1 = "abcsamridh";
        // String s2 = s1.substring(3);
        // System.out.println(s2);


        // Write a program to count the occurrences of a specific character in a string.

        // String s = "abbccc";
        // int count =0;

        // for(int i =0;i<s.length();i++)
        // {
        //     if(s.charAt(i) == 'c')
        //     {
        //         count++;
        //     }
        // }

        // System.out.println(count);



        // Write a program to remove all white spaces from a given string.

        // String s1 = "ab ba ca";
        // StringBuffer s2 = new StringBuffer();

        // for(int i =0;i<s1.length();i++)
        // {
        //     if(s1.charAt(i) != ' ')
        //     {
        //         s2.append(s1.charAt(i));
        //     }
        // }

        // System.out.println(s2);

        // String s1 = "ab ba ca";
        // String s2 = s1.replaceAll(" ", "");
        // System.out.println(s2);


    }
}
