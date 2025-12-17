//Creating Class with name AgeOfHarry indicating the purpose is to calculate age based on birth year and current year. 
class AgeOfHarry{
    public static void main(String args[]){
        // Declaring variables to store birth year and current year.
        int birthYear=2000, currentYear=2024;
        
        // Calculating age.
        int age = currentYear - birthYear;

        // Displaying the calculated age
        System.out.println("Harry's age in 2024 is " + age);
    }
}