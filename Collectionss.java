import java.util.ArrayList;
import java.util.Scanner;

public class Collectionss 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name");
        String first = sc.nextLine();

        while(!first.equals("STOP"))
        {
            names.add(first);
            System.out.println("Enter another name");
            first = sc.nextLine();
        }

        if(names.contains("roshit"))
        {
            names.remove("roshit");
        }
            
        sc.close();
        names.sort(null);

        System.out.println(names);
    }
}
