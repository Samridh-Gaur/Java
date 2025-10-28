import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Assignment9 
{
    public static void main(String[] args) 
    {
        // 1. Write a Java program that:
        // Creates an ArrayList of integers.


        // Adds 10 random numbers to the list.


        // Finds and prints the maximum and minimum numbers from the list.


        // Sorts the list in ascending and descending order.


        // ArrayList<Integer> abc = new ArrayList<>();
        // abc.add(2);
        // abc.add(1);
        // abc.add(3);
        // abc.add(5);
        // abc.add(4);

        // int great = abc.get(0);
        // for(int i =0;i<abc.size();i++)
        // {
        //     if(abc.get(i) > great)
        //     {
        //         great = abc.get(i);
        //     }
        // }

        // System.out.println(great);
        // Collections.sort(abc);
        // System.out.println(abc);
        // Collections.reverse(abc);
        // System.out.println(abc);



        // 2. Write a Java program that:
        // Uses a LinkedList as a Queue.


        // Adds 5 elements to the queue.


        // Removes elements from the front and prints the updated queue.


        // Uses peek() and poll() methods to demonstrate their behavior.

        // Queue<Integer> que = new LinkedList<>();
        // que.add(10);
        // que.add(30);
        // que.add(20);
        // System.out.println(que.peek());
        // System.out.println(que.poll());
        // System.out.println(que);


        // 3. Write a Java program that:
        // Creates a PriorityQueue of Strings.


        // Adds 5 names to the queue.


        // Demonstrates how elements are retrieved in natural ordering.


        // Implements a custom comparator to sort names in reverse order.


        // PriorityQueue<String> abc = new PriorityQueue<>(Comparator.reverseOrder());
        // abc.add("banana");
        // abc.add("apple");
        // System.out.println(abc);
        



        // 4. Write a Java program that:
        // Uses the Scanner class to take 5 integer inputs from the user.


        // Stores them in an ArrayList.


        // Prints the sum and average of the numbers entered.


        // Checks if a specific number (provided by the user) exists in the list.

        // int sum =0;
        // int avg =0;
        // Scanner sc = new Scanner(System.in);
       

        // ArrayList<Integer> abc = new ArrayList<>();
        // System.out.print("a :-");
        // abc.add(sc.nextInt());

        // System.out.print("b :-");
        // abc.add(sc.nextInt());

        // System.out.print("c :-");
        // abc.add(sc.nextInt());

        // for(int i=0;i<abc.size();i++)
        // {
        //     sum += abc.get(i);
        // }

        // System.out.println("sum is " +sum);
        // avg = sum/abc.size();
        // System.out.println("avg is "+avg);

        // System.out.println("Check for availability "+abc.contains(sc.nextInt()));
        // sc.close();



        // 5. Write a Java program that:
        // Uses a LinkedList to store 6 integers.


        // Converts the LinkedList into an ArrayList.


        // Sorts the ArrayList and prints the result.


        // Removes the last two elements from the ArrayList and prints the final list.


        // LinkedList<Integer> abc = new LinkedList<>();
        // abc.add(10);
        // abc.add(30);
        // abc.add(20);

        // ArrayList<Integer> abc2 = new ArrayList<>(abc);
        // System.out.println(abc2);
        // Collections.sort(abc2);
        // System.out.println(abc2);
        // abc2.remove(abc2.size()-1);
        // abc2.remove(abc2.size()-1);
        // System.out.println(abc2);

    }
}
