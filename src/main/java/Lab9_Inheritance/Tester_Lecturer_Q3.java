package Lab9_Inheritance;

/*
 * Tester class
 * Used to test the Student class
 */
public class Tester_Lecturer_Q3{

    public static void main(String[] args) {

        // Create Student object
        Lecturer L = new Lecturer(
                "EMT",          // name
                "Male",           // gender
                "3/9/2000",       // date of birth
                "lecturer.txt"      // input file
        );

        // Display student profile and course details
        L.display();
    }
}
