/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_Selection_IfElse;

/**
 *
 * @author Izzat
 */
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.println("Given two linear equations 1. ax+by=e , 2. cx+dy=f");
        System.out.println("To find x and y you must enter value for :");
        System.out.println("a:");
        a = k.nextDouble();
        System.out.println("b:");
        b = k.nextDouble();
        System.out.println("c:");
        c = k.nextDouble();
        System.out.println("d:");
        d = k.nextDouble();
        System.out.println("e:");
        e= k.nextDouble();
        System.out.println("f:");
        f = k.nextDouble();
        if(a*d - b*c == 0){
            System.out.println("The equation has no solution.");
        }
        else {
            x = (e*d - b*f)/(a*d - b*c) ; 
            y = (a*f - e*c)/(a*d - b*c) ;
            System.out.println("Solution for x : "+ x);
            System.out.println("Solution for y : "+ y);
        }
        
        k.close();
    }
    
}
