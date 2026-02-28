
package Lab9_Inheritance;

import java.util.Scanner;


public class Circle extends Shape{
    
    private double diameter ;
    
    public Circle(){
        super();
        setName("Circle");
    }
    
    public void input(){
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter diameter : ");
        diameter = k.nextDouble();
            
    }
    
    public void calcPerimeter(){
        
        double perimeter = 2*3.142*(diameter/2) ;
        setPerimeter(perimeter);
        
    }
    
    public void calcArea(){
        
        double area = 3.142*(diameter/2)*(diameter/2) ;
        setArea(area);
        
    }
    
}
