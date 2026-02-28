
package Lab9_Inheritance;

import java.util.Scanner;


public class Square extends Shape{
    
    private double length ;
    
    public Square(){
        super();
        setName("Square");
    }
    
    public void input(){
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter length : ");
        length = k.nextDouble();
            
    }
    
    public void calcPerimeter(){
        
        double perimeter = length*4 ;
        setPerimeter(perimeter);
        
    }
    
    public void calcArea(){
        
        double area = length*length ;
        setArea(area);
        
    }
    
        
}
