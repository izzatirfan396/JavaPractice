package Lab9_Inheritance;

/*
 * Tester class
 * Used to test the Student class
 */
public class Tester_Student_Q2 {

    public static void main(String[] args) {

        // Create Student object
        Student s = new Student(
                "Izzat",          // name
                "Male",           // gender
                "3/9/2006",       // date of birth
                "course.txt"      // input file
        );

        // Display student profile and course details
        s.display();
    }
}
