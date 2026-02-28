
package Lab7_FileIO;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class q5 {
    public static void main(String[] args) {
        
     try{
    
    ObjectInputStream data = new ObjectInputStream(new FileInputStream("person.dat"));
    
    int numb = data.readInt();
    
    String [] name = new String [numb];
    int [] age = new int [numb];
    char [] gender = new char [numb];
    
         for (int i = 0; i < numb; i++) {
             
             name [i] = data.readUTF();
             age [i] = data.readInt();
             gender [i] = data.readChar();
             
             
         }
         
         for (int i = 0; i < name.length - 1 ; i++){
             for (int j = 0; j < name.length - 1 - i; j++) {
                
                 if(name[j].compareTo(name[j+1])>0){
                   
                   String tempName = name[j];
                   name[j]=name[j+1];
                   name[j+1] = tempName;
                   
                   
                  int tempAge = age[j];
                  age[j]=age[j+1];
                  age[j+1] = tempAge;
                  
                  char tempG = gender[j];
                  gender[j]=gender[j+1];
                  gender[j+1] = tempG;
             }
                 
             }
         }
         
         System.out.println("The records : ");
         
         for (int i = 0; i < numb ; i++) {
             System.out.println(name[i] + " " + age[i] + " " + gender[i]);
         }
         
         
 data.close();        
    
}catch(IOException ex){
    
            System.out.println("Error :" + ex);
    
}
}
}


/*
package com.mycompany.lab7_file_io;

import java.io.ObjectInputStream;   // Used to read data from a binary file
import java.io.FileInputStream;     // Opens the binary file for reading
import java.io.IOException;         // Handles input/output errors

public class q5 {
    public static void main(String[] args) {

        try {

            // ==============================
            // STEP 1: OPEN BINARY FILE
            // ==============================
            // person.dat is a binary file written using ObjectOutputStream
            ObjectInputStream data =
                    new ObjectInputStream(new FileInputStream("person.dat"));

            // ==============================
            // STEP 2: READ NUMBER OF RECORDS
            // ==============================
            // The first value in the file is an int indicating
            // how many person records are stored
            int numb = data.readInt();

            // ==============================
            // STEP 3: CREATE PARALLEL ARRAYS
            // ==============================
            // Each index represents ONE person
            // name[i], age[i], gender[i] belong to the same person
            String[] name = new String[numb];
            int[] age = new int[numb];
            char[] gender = new char[numb];

            // ==============================
            // STEP 4: READ ALL RECORDS
            // ==============================
            // Must read in the SAME ORDER as the file was written:
            // String (name) → int (age) → char (gender)
            for (int i = 0; i < numb; i++) {
                name[i] = data.readUTF();
                age[i] = data.readInt();
                gender[i] = data.readChar();
            }

            // ==============================
            // STEP 5: SORT BY NAME (ASCENDING)
            // ==============================
            // Bubble sort is sufficient
            // IMPORTANT: When swapping names, we MUST also swap
            // age and gender to keep the person's record intact
            for (int i = 0; i < name.length - 1; i++) {
                for (int j = 0; j < name.length - 1 - i; j++) {

                    // compareTo() is used to compare Strings alphabetically
                    // If name[j] comes AFTER name[j+1], swap them
                    if (name[j].compareTo(name[j + 1]) > 0) {

                        // --- swap name ---
                        String tempName = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = tempName;

                        // --- swap age (same index as name) ---
                        int tempAge = age[j];
                        age[j] = age[j + 1];
                        age[j + 1] = tempAge;

                        // --- swap gender (same index as name) ---
                        char tempGender = gender[j];
                        gender[j] = gender[j + 1];
                        gender[j + 1] = tempGender;
                    }
                }
            }

            // ==============================
            // STEP 6: DISPLAY SORTED RECORDS
            // ==============================
            System.out.println("The records:");

            for (int i = 0; i < numb; i++) {

                // Convert gender code to readable form (optional but clear)
                String genderText =
                        (gender[i] == 'M') ? "Male" : "Female";

                System.out.println(
                        name[i] + " " + age[i] + " " + genderText
                );
            }

            // ==============================
            // STEP 7: CLOSE FILE
            // ==============================
            data.close();

        } catch (IOException ex) {
            // Handles file not found, read errors, etc.
            System.out.println("Error: " + ex);
        }
    }
}
*/