
package Lab4_Loop_For;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        // --- 1. Get Input ---
        System.out.print("Enter a year: ");
        int year = k.nextInt();
        
        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int firstDayOfYear = k.nextInt();

        // --- 2. Check for Leap Year ---
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int daysInFebruary = isLeapYear ? 29 : 28;

        // --- 3. Calculate and Print May's Calendar ---
        
        // Find total days before May 1st (Jan, Feb, Mar, Apr)
        int totalDaysBeforeMay = 31 + daysInFebruary + 31 + 30;
        
        // Find the start day for May
        int mayStartDay = (firstDayOfYear + totalDaysBeforeMay) % 7;
        
        // Call the helper method to print
        printCalendar("May", year, mayStartDay, 31);

        
        // --- 4. Calculate and Print August's Calendar ---
        
        // Find total days before August 1st (add May, Jun, Jul)
        int totalDaysBeforeAugust = totalDaysBeforeMay + 31 + 30 + 31;
        
        // Find the start day for August
        int augustStartDay = (firstDayOfYear + totalDaysBeforeAugust) % 7;
        
        // Call the helper method to print
        printCalendar("August", year, augustStartDay, 31);
        
        k.close();
    }

    /**
     * A helper method to print a formatted monthly calendar.
     * @param monthName The name of the month
     * @param year The year (for the title)
     * @param startDay The day of the week for the 1st (0-6)
     * @param daysInMonth The number of days in the month
     */
    public static void printCalendar(String monthName, int year, int startDay, int daysInMonth) {
        
        // Print the title
        System.out.println("\n          " + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print the initial padding (blank spaces)
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); // 4 spaces
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Use printf for clean, 4-space alignment
            System.out.printf("%4d", day); 
            
            // Check if we are at the end of the week (Saturday)
            // (startDay + day) % 7 == 0 will be true on Saturday
            if ((startDay + day) % 7 == 0) {
                System.out.println(); // Start a new line
            }
        }
        System.out.println("\n"); // Add newlines for separation
    }
}
