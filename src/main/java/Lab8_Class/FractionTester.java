
package Lab8_Class;

import java.util.Scanner;

public class FractionTester {
    public static void main(String[] args) {
        
    
    Scanner k = new Scanner(System.in);
    
    System.out.println("Enter the numerator : ");
    int nume = k.nextInt(); 
    System.out.println("Enter the denominator : ");
    int deno = k.nextInt();
    
    if(deno!=0){
    
    Fraction f = new Fraction(nume ,deno);
    
    f.setNume(nume);
    f.setDeno(deno);
    f.GCD();
    
    
    }else{
        System.out.println("Denominator must bigger than 0");
    }
    }   
}
