
package Lab6_Methods;
import java.util.Scanner;

public class VIVA2_Q1 {
 public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter any integer number: ");
        int inputNumber = k.nextInt();
        
        int nearest = getNearestPrime(inputNumber);
        
        System.out.println("Nearest Prime: " + nearest);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static int getNearestPrime(int num) {
        if (isPrime(num)) {
            return num;
        }

        int distance = 1;
        
        while (true) { 
            if (isPrime(num - distance)) {
                return (num - distance);
            }
            if (isPrime(num + distance)) {
                return (num + distance);
            }
            
            distance++; 
        }
    }
}
