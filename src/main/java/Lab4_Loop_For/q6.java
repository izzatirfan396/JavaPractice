
package Lab4_Loop_For;
import java.util.Random;
public class q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int OriNumber = rand.nextInt(Integer.MAX_VALUE);
        int number = OriNumber ; 
        int numDigits = 0 ;
        int DivNumb ;
        while(number >0){
        number = number/10 ;
        numDigits++ ;
        
        }
        System.out.println("The number generated :" + OriNumber );
        System.out.println("Number of digits :"+ numDigits);
    }
}
