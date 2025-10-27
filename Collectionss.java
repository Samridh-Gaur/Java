import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Collectionss 
{
    public static void main(String[] args) 
    {

        // Question 1:

        // Write a Java program that does the following using an ArrayList:
        // Takes user input to add names (strings) to an ArrayList dynamically until the user enters "STOP".


        // Removes a specific name from the list if the user provides it.


        // Sorts the names in alphabetical order.


        // Displays the final list after sorting.


        // Constraints:
        // Use an ArrayList<String> to store names.


        // Use Scanner for input.


        // Ensure the program does not break if the user tries to remove a name that does not exist.


        // ArrayList<String> names = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Name");
        // String first = sc.nextLine();

        // while(!first.equals("STOP"))
        // {
        //     names.add(first);
        //     System.out.println("Enter another name");
        //     first = sc.nextLine();
        // }

        // if(names.contains("roshit"))
        // {
        //     names.remove("roshit");
        // }
            
        // sc.close();
        // names.sort(null);

        // System.out.println(names);


        // Question 2:
        // Create a Java program that manages a Task List using ArrayList and its various methods. The program should allow users to:
        // Add a new task to the list.


        // Remove a task by its index.


        // Update an existing task by replacing it with a new one.


        // Check if a task exists in the list.


        // Display all tasks in the list.


        // Clear all tasks from the list.


        // Requirements:
        // Use ArrayList<String> to store task names.


        // Implement ArrayList methods like add(), remove(), set(), contains(), clear(), and size().


        // The program should keep running until the user chooses to exit.


        // while (true) 
        // {

            // System.out.println("Add a new task");
            // ArrayList<String> list = new ArrayList<>();
            // list.add("samridh");
            // list.add("roshit");
            // Scanner sc = new Scanner(System.in);
            // list.add(sc.nextLine());
            // System.out.println("Enter the index to remove the task");
            // list.remove(sc.nextInt());
            // System.out.println(list);
        // }







        // Question 3:
        // Write a Java program that implements a Student Grade Book using a HashMap. The program should provide a menu-driven interface that allows the user to perform the following operations:
        // Add a Student:


        // Input a student's name (String) and grade (Integer), and store them in the grade book.


        // Update a Student's Grade:


        // Update the grade for an existing student.


        // Remove a Student:


        // Remove a student from the grade book by name.


        // Search for a Student's Grade:


        // Given a student's name, display their grade.


        // If the student is not found, display an appropriate message.


        // Display All Students and Grades:


        // Show all student names along with their corresponding grades stored in the grade book.


        // Exit:


        // End the program.


        // Requirements:
        // Use a HashMap<String, Integer> to store the student names as keys and their grades as values.


        // Validate user inputs where necessary (for example, ensure that the student exists before updating or removing).


        // The program should loop until the user chooses to exit.


        


        // Question 4:
        // Write a Java program that does the following:
        // Input a Sentence:


        // Read a line of text (a sentence) from the user.


        // Extract Unique Words:


        // Use a HashSet<String> to store each word from the sentence, ensuring that duplicate words are stored only once.


        // Display Results:


        // Print the list of unique words.


        // Also, print the total count of unique words.


        // Requirements:
        // Use the HashSet class to filter out duplicate words.


        // Consider that words are separated by spaces.


        // The program should ignore case differences (e.g., "Java" and "java" should be considered the same word).
        
    }
}
