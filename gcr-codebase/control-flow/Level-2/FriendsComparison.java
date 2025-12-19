import java.util.*;
// Creating a class with name FriendsComparison to find the youngest friend and tallest friend
public class FriendsComparison {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ages
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Heights
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();
        
        // Find youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Amar is the youngest");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // Find tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Amar is the tallest");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
     }
}