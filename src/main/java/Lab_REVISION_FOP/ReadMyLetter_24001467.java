/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_REVISION_FOP;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Izzat
 */
public class ReadMyLetter_24001467 {
    public static void main(String[] args) {
        
        
        Scanner keyboard = new Scanner(System.in);
        try {
            
        System.out.println("----First part of the letter----");
        Scanner read = new Scanner(new FileInputStream("izzat_24001467.txt"));
        while(read.hasNextLine()){
        String line = read.nextLine();
        System.out.println(line);
    }
        read.close();
    
              System.out.println("How did you perform in the DS class? ");
            String performance = keyboard.nextLine();

            System.out.println("Are you happy with your performance? ");
            String happy = keyboard.nextLine();

            System.out.println("What did you learn from this course? ");
            String learning = keyboard.nextLine();

            System.out.println("Is there any change to your target grade? ");
            String grade = keyboard.nextLine();

            System.out.println("What did you do well during the course? ");
            String well = keyboard.nextLine();

            System.out.println("What could you have done better? ");
            String better = keyboard.nextLine();

            
            PrintWriter write = new PrintWriter(new FileOutputStream("izzat_24001467.txt",true)); // true to kekalkan text yang sedia ada in the txt file , and just to append new texts so we need to put true
            write.println("----Second part of the letter----");
            write.println("Thursday, 18 June 2021.");
            write.println("It's me again. Finally, the DS class has finished!");
            write.println("I think I performed " + performance + " in the class.");
            write.println("I am " + happy + " with my performance.");
            write.println("I learned " + learning + " from this course.");
            write.println("My target grade is now " + grade + ".");
            write.println("I did well in " + well + ".");
            write.println("I could improve " + better + ".");
            write.close();
            
             Scanner readFinal = new Scanner(new FileInputStream("izzat_24001467.txt"));
        while(readFinal.hasNextLine()){
        String line = readFinal.nextLine();
        System.out.println(line);
        }
        }catch(IOException e){
            System.out.println(e);
        }
        
  
}
}