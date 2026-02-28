/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Inheritance;


import java.util.Scanner;


/**
 *
 * @author Izzat
 */

public class Rectangle extends Shape{
    
    private double length ;
    private double width ;
    
    public Rectangle(){
        super();
        setName("Rectangle");
    }
    
    public void input(){
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter length : ");
        length = k.nextDouble();
        
        System.out.println("Enter width : ");
        width = k.nextDouble();
        
        
    }
    
    public void calcPerimeter(){
        
        double perimeter = 2*width + 2*length ;
        setPerimeter(perimeter);
        
    }
    
    public void calcArea(){
        
        double area = width*length ;
        setArea(area);
        
    }
    
        
}
