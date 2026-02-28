/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Fundamental_Coding;
import java.util.Scanner;
import java.util.Random;
public class Q5 {
    public static void main(String [] args){
     Random rand = new Random();   
     int range = 10001 ; 
     int OriRandomNumber = rand.nextInt(range);
     int SUM = 0 ;
     int RandomNumber = OriRandomNumber;
     while(RandomNumber != 0){
         int lastDigit = RandomNumber % 10 ;
         SUM += lastDigit;
         RandomNumber = RandomNumber / 10 ;
     }
     System.out.println("Number Generated between 0-10000 :"+ OriRandomNumber );
     System.out.println("Sum of all the digits :"+ SUM);
    
    }
}


