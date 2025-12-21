import java.util.*;
// Creating a class with name YoungestAndTallestFriend to find the youngest friend and tallest friend
public class YoungestAndTallestFriend {
    // Find youngest
    public static void getYongest(int age[]){

        if (age[0] < age[1] && age[0] < age[2])
            System.out.println("Amar is the youngest");
        else if (age[1] < age[0] && age[1] < age[2])
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");
    }

    // Find tallest
    public static void getTallest(double height[]){

        if (height[0] > height[1] && height[0] > height[2])
            System.out.println("Amar is the tallest");
        else if (height[1] > height[0] && height[1] > height[2])
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ages
        System.out.print("Enter the age of Amar : ");
        int amarAge = input.nextInt();
        System.out.print("Enter the age of Akbar : ");
        int akbarAge = input.nextInt();
        System.out.print("Enter the age of Anthony : ");
        int anthonyAge = input.nextInt();
        int age[] = new int[3];
        age[0] = amarAge;
        age[1] = akbarAge;
        age[2] = anthonyAge;
        
        // Call method to return results
        getYongest(age);

        // Heights
        System.out.print("Enter the age of Amar : ");
        double amarHeight = input.nextDouble();
        System.out.print("Enter the age of Amar : ");
        double akbarHeight = input.nextDouble();
        System.out.print("Enter the age of Amar : ");
        double anthonyHeight = input.nextDouble();
        double height[] = new double[3];
        height[0] = amarHeight;
        height[1] = akbarHeight;
        height[2] = anthonyHeight;
        
        // Call method to return results
        getTallest(height);

        input.close();
     }
}