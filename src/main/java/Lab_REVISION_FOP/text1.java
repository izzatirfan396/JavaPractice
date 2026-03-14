/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_REVISION_FOP;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Izzat
 */
public class text1 {
    public static void main(String[] args) {
        
    
    try(Scanner read = new Scanner(new FileInputStream ("text1.txt"))){
        int count = 0;
        
        while(read.hasNextLine()){
            String line = read.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                
                if (Character.isLetter(c)) {
                    System.out.print(c + " ");
                    count++;
                }
                
            }
            System.out.println("");
        }
        System.out.println("Number of characters retrieved from text1 : " + count );
        
    
    
}catch(IOException e){
        System.out.println("Read error:" + e);
}
    try(Scanner read = new Scanner(new FileInputStream ("text2.txt"))){
        int count = 0;
        String currentNum = "";
        while(read.hasNextLine()){
            String line = read.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                
                if (Character.isDigit(c)) {
                    currentNum += c ;
                
                }else{
                    if(!currentNum.isEmpty()){
                        System.out.print(currentNum + " ");
                        count++;
                        currentNum = "" ;
                    }
                }  
            }
            if(!currentNum.isEmpty()){
                        System.out.println(currentNum);
                        count++ ;
                        currentNum = "" ;
                    }    
        }
        System.out.println("Number of digits retrieved from text2 : "+ count);
    
    
}catch(IOException e){
        System.out.println("Read error:" + e);
}
    
     try(Scanner read = new Scanner(new FileInputStream ("text3.txt"))){
        int count = 0;
        String currentNum = "";
        while(read.hasNextLine()){
            String line = read.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                
                if (Character.isDigit(c) || c == '.') {
                    currentNum += c ;
                
                }else{
                    if(!currentNum.isEmpty()){
                        System.out.print(currentNum + " ");
                        count++;
                        currentNum = "" ;
                    }
                }  
            }
            if(!currentNum.isEmpty()){
                        System.out.println(currentNum);
                        count++ ;
                        currentNum = "" ; 
                    }    
        }
        System.out.println("Number of Real Numbers retrieved from text3 : "+ count);
    
    
}catch(IOException e){
        System.out.println("Read error:" + e);
}
     
     try(Scanner read = new Scanner(new FileInputStream ("text4.txt"))){
         int count = 0 ;
         String currentComb = "";
         
         while(read.hasNextLine()){
             String line = read.nextLine();
             for (int i = 0; i < line.length(); i++) {
             char c = line.charAt(i);
             
             if(Character.isLetter(c)){
                 currentComb += c ;
             }else{
                 if(!currentComb.isEmpty()){
                     System.out.print(currentComb + " ");
                     count ++ ;
                     currentComb = "";
                 }
             }   
             }
              if(!currentComb.isEmpty()){
                     System.out.println(currentComb + " ");
                     count ++ ;
              }
            
         }
         System.out.println("Number of Letters  retrieved from text4 : "+ count);
         
         
     }catch(IOException e){
         
     }
    
    
    
}
}