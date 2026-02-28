package Lab9_Inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Lecturer class
 * Inherits from PersonProfile
 * Reads lecturer course information from a file
 */
public class Lecturer extends PersonProfile {

    // Arrays to store course information
    private String[] courseCode;
    private String[] courseName;
    private int[] session;
    private int[] semester;
    private double[] creditHour;
    private int[] numbStudent;

    // Number of courses read from file
    private int totalCourse;

    /*
     * Constructor
     * Receives lecturer profile + file name
     */
    public Lecturer(String name, String gender, String dateOfBirth, String fileName) {

        // Call superclass constructor
        super(name, gender, dateOfBirth);

        // Initialize arrays (based on lecturer.txt having 4 courses)
        courseCode = new String[4];
        courseName = new String[4];
        session = new int[4];
        semester = new int[4];
        creditHour = new double[4];
        numbStudent = new int[4];

        totalCourse = 0;

        // Read data from file
        try {
            Scanner input = new Scanner(new FileInputStream(fileName));

            /*
             * Each course consists of 6 lines:
             * code
             * name
             * session
             * semester
             * credit hour
             * number of students
             */
            while (input.hasNextLine()) {

                courseCode[totalCourse] = input.nextLine();
                courseName[totalCourse] = input.nextLine();
                session[totalCourse] = Integer.parseInt(input.nextLine());
                semester[totalCourse] = Integer.parseInt(input.nextLine());
                creditHour[totalCourse] = Double.parseDouble(input.nextLine());
                numbStudent[totalCourse] = Integer.parseInt(input.nextLine());

                totalCourse++; // move to next course
            }

            input.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    /*
     * Method to compute UPDATED credit hour for ONE course
     * Uses number of students as condition
     */
    public double getUpdatedCreditHour(int index) {

        if (numbStudent[index] >= 150) {
            return creditHour[index] * 3;
        } 
        else if (numbStudent[index] >= 100) {
            return creditHour[index] * 2;
        } 
        else if (numbStudent[index] >= 50) {
            return creditHour[index] * 1.5;
        } 
        else {
            return creditHour[index];
        }
    }

    /*
     * Display method
     * Overrides display() from PersonProfile
     */
    public void display() {

        // Display lecturer profile
        super.display();

        System.out.println("\nCourse Details:");
        System.out.println("---------------------------------------------");

        // Display all course information
        for (int i = 0; i < totalCourse; i++) {

            System.out.println("Course Code                : " + courseCode[i]);
            System.out.println("Course Name                : " + courseName[i]);
            System.out.println("Session                    : " + session[i]);
            System.out.println("Semester                   : " + semester[i]);
            System.out.println("Number of Students         : " + numbStudent[i]);
            System.out.println("Credit Hour (Original)     : " + creditHour[i]);
            System.out.println("Credit Hour (Updated)      : " + getUpdatedCreditHour(i));
            System.out.println("---------------------------------------------");
        }
    }
}