
package Lab7_FileIO;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;



public class Q2 {
    public static void main(String[] args) {
        try{
           URL u = new URL("http://www.google.com");
           URLConnection cnn = u.openConnection();
           InputStream stream = cnn.getInputStream();
           Scanner in = new Scanner(stream);
           
           PrintWriter write = new PrintWriter(new FileOutputStream("index.htm"));
           
           while(in.hasNextLine()){          //How the Cursor Moves
                                             //Before the Loop Starts: Your "finger" (the cursor) is at the very beginning of the file, pointing at the start of Line 1.
                                             //The Check (hasNextLine): The Scanner looks from where the finger is currently pointing. It sees Line 1. Since there is data there, it returns true.
                                             //The Action (nextLine): The Scanner reads everything until the end of that line and then moves the finger to the start of Line 2.
                                             //The Repeat: This continues until you reach the Last Line. 
           String line = in.nextLine();
           write.println(line);
           
           } 
           
           in.close();
           write.close();
            System.out.println("Finish writing all the text into file index.htm  ");
           
        }catch(IOException ex){
            System.out.println("IO Error:"+ ex.getMessage());
        }
        

      

        
    }
}
