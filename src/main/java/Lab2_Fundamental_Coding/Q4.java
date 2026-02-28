/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Fundamental_Coding;

/**
 *
 * @author Izzat
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String []args){
    Scanner k = new Scanner(System.in);
    int SecondInput , MinutesUse , SecondResult , HourResult , MinutesResult; 
    System.out.println("Enter The Seconds to be convert :");
    SecondInput = k.nextInt();
    MinutesUse = Math.floorDiv(SecondInput, 60 );
    SecondResult = SecondInput % 60 ;
    HourResult = Math.floorDiv(MinutesUse , 60) ;
    MinutesResult = MinutesUse % 60 ; 
    System.out.println(SecondInput + " seconds is " + HourResult + " hours, " + MinutesResult + " minutes and " + SecondResult + " seconds");
    }
    
   
    
   
    
}
