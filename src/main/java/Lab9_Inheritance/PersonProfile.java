package Lab9_Inheritance;

/*
 * Superclass: PersonProfile
 * This class stores general information about a person.
 * It will be inherited by Student and Lecturer classes.
 */
public class PersonProfile {

    // Private variables (encapsulation)
    private String name;
    private String gender;
    private String dateOfBirth;

    /*
     * Constructor
     * This constructor is called when a PersonProfile (or subclass) object is created
     */
    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    /*
     * Display method
     * Used to display the person profile information
     */
    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("DOB    : " + dateOfBirth);
    }
}
