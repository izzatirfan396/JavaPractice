/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Inheritance;

/**
 *
 * @author Izzat
 */
public class Shape {
    private String name ;
    private double perimeter;
    private double area ;
    
    public Shape(){
    }
    
    public void setName(String name){
        this.name = name ; 
    }
    
    public double getPerimeter(){ //accessor
        return perimeter;
    }
    
    public void setPerimeter(double perimeter){ //mutator
        
        this.perimeter = perimeter ; 
        
    }
    
    public double getArea(){ //accessor
        
        return area;
        
    }
    
    public void setArea(double area){ //mutator
       
        this.area = area; 
        
    }
    
    public void Display(){
        
        System.out.println("Name : "+ name );
        System.out.printf("Perimeter : %.2f\n", perimeter);
        System.out.printf("area : %.2f\n", area);
    }
}
