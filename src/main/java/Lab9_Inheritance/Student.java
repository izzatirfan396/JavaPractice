package Lab9_Inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Student class
 * This class inherits from PersonProfile
 * It reads course information from a text file
 */
public class Student extends PersonProfile {

    // Arrays to store course information
    private String[] courseCode;
    private String[] courseName;
    private String[] session;
    private int[] semester;
    private int[] mark;

    // To store how many courses are read from the file
    private int totalCourse;

    /*
     * Constructor for Student
     * Parameters:
     * - name, gender, dob : student profile
     * - filename         : text file that contains course data
     */
    public Student(String name, String gender, String dob, String filename) {

        // Call superclass constructor
        super(name, gender, dob);

        // Initialize arrays (file has 5 courses)
        courseCode = new String[5];
        courseName = new String[5];
        session = new String[5];
        semester = new int[5];
        mark = new int[5];

        // Initialize course counter
        totalCourse = 0;

        /*
         * Read data from file
         */
        try {
            // Create Scanner object to read file
            Scanner input = new Scanner(new FileInputStream(filename));

            /*
             * Each course consists of 5 lines:
             * code, name, session, semester, mark
             */
            while (input.hasNextLine()) {

                // Read course information line by line
                courseCode[totalCourse] = input.nextLine();
                courseName[totalCourse] = input.nextLine();
                session[totalCourse] = input.nextLine();

                // Read integer values safely using nextLine + parseInt
                semester[totalCourse] = Integer.parseInt(input.nextLine());
                mark[totalCourse] = Integer.parseInt(input.nextLine());

                // Move to next course index
                totalCourse++;
            }

            // Close file
            input.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    /*
     * Method to determine grade based on mark
     */
    public char getGrade(int m) {
        if (m >= 85) return 'A';
        else if (m >= 75) return 'A';
        else if (m >= 70) return 'B';
        else if (m >= 65) return 'B';
        else if (m >= 60) return 'B';
        else if (m >= 55) return 'C';
        else if (m >= 50) return 'C';
        else if (m >= 45) return 'D';
        else if (m >= 35) return 'E';
        else return 'F';
    }

    /*
     * Display method
     * Overrides display() from PersonProfile
     */
    public void display() {

        // Display student profile (from superclass)
        super.display();

        System.out.println("\nCourse Details:");
        System.out.println("---------------------------------------------");

        // Loop through all courses
        for (int i = 0; i < totalCourse; i++) {
            System.out.println("Course Code : " + courseCode[i]);
            System.out.println("Course Name : " + courseName[i]);
            System.out.println("Session     : " + session[i]);
            System.out.println("Semester    : " + semester[i]);
            System.out.println("Mark        : " + mark[i]);
            System.out.println("Grade       : " + getGrade(mark[i]));
            System.out.println("---------------------------------------------");
        }
    }
}
