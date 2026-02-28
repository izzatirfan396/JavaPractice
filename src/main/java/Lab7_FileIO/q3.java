
package Lab7_FileIO;
import java.io.*;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        
        // CREATE A Input text file before reverse 
        
        try{
        
            PrintWriter pwo = new PrintWriter(new FileOutputStream("beforeReverse.txt")); 
            
            pwo.println("hud dan didididi");
            pwo.println("ijat");
            pwo.println("anus67");
            pwo.close();       
        
        }catch(IOException ex){
            System.out.println("Error file : "+ ex);
        }
        
        // read the before reverse text , store in the program , reverse it 
        
        try{
           
           Scanner input = new Scanner(new FileInputStream("beforeReverse.txt"));
           
           PrintWriter output = new PrintWriter (new FileOutputStream("Reversed.txt"));
                   
                   
           while(input.hasNextLine()){
               
               
               String reversedWord = "";  //initializing an empty string.
               
               String word = input.nextLine(); // read the first line in beforeReverses.txt and assign it into variable "word"
               
               for (int i = word.length()- 1; i >= 0; i--) {  // index in string start at 0 , thus forexample "hud" , h=0 , u=1 , d=2 
                   reversedWord += word.charAt(i); // assign the last index character into the variable reverseWord to form a string with characterS , 012 --> 210
               }
               output.println(reversedWord); // write the reversedWord line into the file Reversed.txt 
           }       
           
           input.close();
           output.close();
        
        }catch(IOException ex){
            System.out.println("Error file : "+ ex);
        }
        
        
        
        
    }
}
