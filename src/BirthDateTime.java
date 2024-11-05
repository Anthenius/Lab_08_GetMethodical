import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the year between 1950 and 2015
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Get the month between 1 and 12
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Determine the number of days in the selected month
        int maxDays = 31;  // Default to 31 days for months like Jan, Mar, etc.

        switch (month) {
            case 2: // February - Leap year considered for simplicity (29 days)
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29; // Leap year
                } else {
                    maxDays = 28; // Regular year
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        // Get the day based on the month's maximum days
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, maxDays);

        // Get the hour between 1 and 24 (1-24 for 24-hour format)
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24)", 1, 24);

        // Get the minute between 0 and 59
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth (0-59)", 0, 59);

        // Display the collected date and time information
        System.out.printf("Your birth date and time is: %d-%02d-%02d %02d:%02d\n", year, month, day, hour, minute);

        in.close();
    }
}
