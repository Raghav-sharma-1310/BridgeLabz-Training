/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/


import java.util.Scanner;

public class BusAttendance009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] studentNames = {
            "Arjun", "Ishaan", "Aavya", "Vihaan", "Saanvi",
            "Aditya", "Ananya", "Sai", "Reyansh", "Diya"
        };

        int[] attendance = new int[studentNames.length];

        System.out.println("=========== School Bus Attendance System  ===========");
        System.out.println("Enter 1 for Present | Enter 0 for Absent");
        System.out.println("-------------------------------------------------------");

        int index = 0;
        // Loop for Present and Absent 
        for (String name : studentNames) { 
            System.out.printf("Is %-10s present? (0/1): ", name);
            attendance[index++] = sc.nextInt();
        }

        System.out.println("\n------------------- Attendance Report ------------------");
        System.out.printf("%-5s %-12s %-10s%n", "S.No", "Student", "Status");
        System.out.println("-------------------------------------------------------");

        int presentCount = 0;
        // Loop for the count of the total present and absent
        for (int i = 0; i < studentNames.length; i++) {
            String status = (attendance[i] == 1) ? "Present" : "Absent";
            if (attendance[i] == 1) presentCount++;

            System.out.printf("%-5d %-12s %-10s%n", (i + 1), studentNames[i], status);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total Present Students : " + presentCount);
        System.out.println("Total Absent Students  : " + (studentNames.length - presentCount));
        System.out.println("=======================================================");

        sc.close();
    }
}
