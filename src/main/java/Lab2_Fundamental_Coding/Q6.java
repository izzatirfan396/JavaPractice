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
public class Q6 {
    public static void main(String[] args){
    Scanner k = new Scanner(System.in);
    int WaterWeight;
    double EnergyNeeded;
    double initialTemp , finalTemp ; 
    System.out.println("Enter the amount of water in gram :");
    WaterWeight = k.nextInt();
    System.out.println("Enter the intial temperature in Fahrenheit :");
    initialTemp = k.nextDouble();
    System.out.println("Enter the final temperature in Fahrenheit :");
    finalTemp = k.nextDouble();
    double IT = (initialTemp - 32)/1.8 ;
    double FT = ( finalTemp  - 32)/1.8 ;
    EnergyNeeded = WaterWeight * ( FT - IT )*4184;
    System.out.println("The energy needed is  :"+ EnergyNeeded);
    
    
    }
    
}
