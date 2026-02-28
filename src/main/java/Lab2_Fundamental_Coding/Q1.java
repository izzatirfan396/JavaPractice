/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_Fundamental_Coding;

import java.util.Scanner;


public class Q1 {
     public static void main(String[] args){
         Scanner k= new Scanner (System.in);
         double f,c;
         System.out.println("Enter the temperature in F ");
         f=k.nextDouble();
         c=(f-32)/1.8;
         System.out.printf("Temperature in C:%.2f",c);
   }
}
