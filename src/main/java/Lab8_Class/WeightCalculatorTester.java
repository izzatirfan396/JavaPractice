
package Lab8_Class;

import java.util.Scanner;

public class WeightCalculatorTester {
    public static void main(String[] args) {
    
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter your age : " );
        int age = k.nextInt();
        
        System.out.println("Enter your height : ");
        double height = k.nextDouble();
        
        WeightCalculator WC = new WeightCalculator(age , height);
        
        
        System.out.printf("The recommended weight : %.2f",WC.recommendWeight());
        
        
    }
    
}
