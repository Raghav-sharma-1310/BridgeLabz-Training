import java.util.*;
// Create a class with name ZaraBonus to find the bonus of employees 
public class ZaraBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 10;

        // Arrays to store salary and years of service
        double employeeSalary[] = new double[size];
        double employeeService[] = new double[size];

        // Arrays to store bonus and new salary
        double[] bonusAmount = new double[size];
        double[] newSalary = new double[size];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input with validation
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary : ");
            employeeSalary[i] = input.nextDouble();

            System.out.print("Years of Service : ");
            employeeService[i] = input.nextDouble();

            // Validation check
            if (employeeSalary[i] <= 0 || employeeService[i] < 0) {
                System.out.println("Invalid input");
                i--; 
                continue;
            }
        }

        // Calculating bonus and totals
        for (int i = 0; i < size; i++) {
            if (employeeService[i] > 5) {
                bonusAmount[i] = employeeSalary[i] * 0.05;
            } else {
                bonusAmount[i] = employeeSalary[i] * 0.02;
            }

            newSalary[i] = employeeSalary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += employeeSalary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
