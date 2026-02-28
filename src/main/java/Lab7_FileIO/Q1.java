
package Lab7_FileIO;
import java.io.ObjectOutputStream;//to write data into binary files
import java.io.FileOutputStream; //to write data into binary files
import java.io.ObjectInputStream;//to read data from binary files into program to display later when user entered course code 
import java.io.FileInputStream;//to read data from binary files into program to display later when user entered course code
import java.io.IOException; //to detect if Something went wrong during input/output.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    
        // ======================
        // PART A: WRITE TO FILE
        // ======================
        
    try {
    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
    output.writeInt(4);
    
    output.writeUTF("WXES1116");                            // MUST BE WRITTEN IN ORDER 
    output.writeUTF("Programming I");
    
    output.writeUTF("WXES1115");
    output.writeUTF("Data Structure");
    
    output.writeUTF("WXES1110");
    output.writeUTF("Operating System");
    
    output.writeUTF("WXES1112");
    output.writeUTF("Computing Mathematics I");
    
    output.close();
    }
    catch(IOException ex){
        System.out.println("Error Writing file");
    } 
   
     // ======================
        // PART B: READ & SEARCH
        // ======================
    
    
    try{
        
    ObjectInputStream data = new ObjectInputStream(new FileInputStream("coursename.dat"));
    int numbC = data.readInt();
    
    Scanner k = new Scanner(System.in);
    System.out.println("Enter Course Code :");
    String CCE = k.nextLine();    
    boolean found = false ;
        for (int i = 0; i < numbC ; i++) {
            String CC = data.readUTF();                          //THE PROGRAM READ IN ORDER THATS WHY ITS IMPORTANT 
            String CN = data.readUTF();
            
            if(CC.equalsIgnoreCase(CCE)){
                System.out.println("The course name : " + CN );
                found = true ;
                break ; 
            }
                 
        }
        
        if (found == false){ //if there is no CC == CCE , the found remains false thats why it will print, unless the found will be convert to true 
            System.out.println("Course Not Found");
        }
     data.close();
    }catch(IOException ex){
        System.out.println("Error reading files");
    }
}
}