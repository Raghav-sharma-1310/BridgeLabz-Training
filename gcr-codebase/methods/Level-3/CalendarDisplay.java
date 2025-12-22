import java.util.*;

public class CalendarDisplay {

    // Array to store month names
    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store number of days in each month
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {

        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {

        System.out.println("\n" + MONTH_NAMES[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getNumberOfDays(month, year);

        // First for-loop: indentation before 1st day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second for-loop: print days of month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        displayCalendar(month, year);

        input.close();
    }
}
