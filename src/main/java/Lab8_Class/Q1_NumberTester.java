
package Lab8_Class;

public class Q1_NumberTester {
    
    public static void main(String[] args) {
        
        Q1_Number a = new Q1_Number();
        Q1_Number b = new Q1_Number(5);
        Q1_Number c = new Q1_Number(4,50);
        
        
        System.out.println("First :");
        a.Display();
        a.Even();
        a.Prime();
        a.Max();
        a.Min();
        a.Average();
        a.Square();
        
        System.out.println("Second :");
        b.Display();
        b.Even();
        b.Prime();
        b.Max();
        b.Min();
        b.Average();
        b.Square();
        
        System.out.println("Third :");
        c.Display();
        c.Even();
        c.Prime();
        c.Max();
        c.Min();
        c.Average();
        c.Square();
       
        
    }
    
}
