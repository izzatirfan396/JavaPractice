
package Lab3_Selection_IfElse;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double r, x, y;
        System.out.println("Enter the radius of the circle :");
        r = k.nextDouble();
        System.out.println("Enter the coordinate :");
        System.out.println("x:");
        x = k.nextDouble();
        System.out.println("y:");
        y = k.nextDouble();
        double d = Math.sqrt( (x*x) + (y*y) );
        if(d>r){
            System.out.println("Coordinate entered is outside the circle ");
        }
        else{
            System.out.println("Coordinate entered is inside the circle");
        }
        
        
        
    }
    
}
