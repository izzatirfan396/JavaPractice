
package Lab7_FileIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class q4 {
    public static void main(String[] args) {
                try{
        
            PrintWriter pwo = new PrintWriter(new FileOutputStream("text.txt")); 
            
            pwo.println("hud dan didididi");
            pwo.println("ijat");
            pwo.println("           ");
            pwo.println("anus67");
            pwo.close();       
        
        }catch(IOException ex){
            System.out.println("Error file : "+ ex);
        }
            try{
         
                
             Scanner read = new Scanner(new FileInputStream("text.txt"));    
             
             PrintWriter pwd = new PrintWriter(new FileOutputStream("number.txt"));
             
             int charCount = 0;
             int wordCount = 0;
             int lineCount = 0;
             
             while(read.hasNextLine()){
                 
                String Sentence = read.nextLine();
                
                //count number of character at present line
                charCount += Sentence.length();
                 
                 
                //count number of words at present line
                if(!Sentence.isEmpty()){
                String [] word = Sentence.split(" ");
                wordCount += word.length;
                }
                
                //count number of line based on how many it loops
                lineCount += 1;
                 
             }
             
           
            
            pwd.println("The number of characters :");
            pwd.println(charCount);
            
            pwd.println("The number of words :");
            pwd.println(wordCount);
           
            
            pwd.println("The number of lines :");
            pwd.println(lineCount);
            
            read.close();
            pwd.close();
            
            }catch(IOException ex){
                System.out.println("Error : " + ex);
            }
             
    }
}
