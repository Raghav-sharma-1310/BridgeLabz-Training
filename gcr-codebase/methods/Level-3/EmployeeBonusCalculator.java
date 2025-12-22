public class EmployeeBonusCalculator {

    // Constants
    public static final int TOTAL_EMPLOYEES = 10;
    public static final int MIN_SALARY = 10000;
    public static final int SALARY_RANGE = 90000;

    // Method to generate employee salary and years of service
    public static int[][] generateEmployeeData() {
        int[][] employeeData = new int[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            employeeData[i][0] = (int) (Math.random() * SALARY_RANGE) + MIN_SALARY;
            employeeData[i][1] = (int) (Math.random() * 10) + 1;
        }
        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] salaryDetails = new double[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            double bonusRate = employeeData[i][1] > 5 ? 0.05 : 0.02;
            double bonusAmount = employeeData[i][0] * bonusRate;
            double newSalary = employeeData[i][0] + bonusAmount;

            salaryDetails[i][0] = bonusAmount;
            salaryDetails[i][1] = newSalary;
        }
        return salaryDetails;
    }

    public static void displaySalaryReport(int[][] employeeData, double[][] salaryDetails) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmployee Salary & Bonus Report (ZARA)");
        System.out.println("EmpID\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            totalOldSalary += employeeData[i][0];
            totalBonus += salaryDetails[i][0];
            totalNewSalary += salaryDetails[i][1];

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f%n",
                    (i + 1),
                    employeeData[i][0],
                    employeeData[i][1],
                    salaryDetails[i][0],
                    salaryDetails[i][1]);
        }

        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f%n",
                totalOldSalary,
                totalBonus,
                totalNewSalary);
    }

    public static void main(String[] args) {

        int[][] employeeData = generateEmployeeData();
        double[][] salaryDetails = calculateBonusAndNewSalary(employeeData);
        displaySalaryReport(employeeData, salaryDetails);
    }
}
