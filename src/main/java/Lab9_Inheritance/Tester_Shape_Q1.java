/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9_Inheritance;

/**
 *
 * @author Izzat
 */
public class Tester_Shape_Q1 {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.input();
        r.calcPerimeter();
        r.calcArea();
        r.Display();
        
        Square s = new Square();
        s.input();
        s.calcPerimeter();
        s.calcArea();
        s.Display();
        
        Circle c = new Circle();
        c.input();
        c.calcPerimeter();
        c.calcArea();
        c.Display();
        
    }
}
