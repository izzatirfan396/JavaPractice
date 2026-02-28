
package Lab4_Loop_For;
import java.util.Scanner;
import java.util.Random;

public class VIVA_Q4 {
    public static void main(String[] args) {
           
        //setup
        Scanner k = new Scanner(System.in);
        Random rand = new Random();
        int n ; 
        
        //input and checking 
        while(true){
            System.out.println("Enter non negative integer (n) between 0-20 : ");
            n = k.nextInt();
            
            if(n>= 0 && n<=20){
            break;
            }else{
                System.out.println("Invalid input! Please enter a number between 0 and 20.");
            }
        }
        
        //factor calculation 
        int fact = 1 ; 
        for(int i = 1 ; i <= n ; i++){
        fact = fact * i ;
        }
        int mode ;
        System.out.println("Choose mode (1-Combinatorics, 2-Security, 3-Game): ");
        mode = k.nextInt();
        System.out.println("Factorial of "+ n + " is " + fact);
        switch (mode) {
        case 1:
                System.out.println("In Combinatorics Mode: You can arrange " + n + " unique items in " + fact + " ways");
                break;
        
        case 2:    
                System.out.println("In Security Mode: You can create " + fact + " unique password combinations using " + n + " characters");
                break;
        case 3:
                System.out.println("In Game mode: You can create "+ fact + " unique level arrangements from "+ n + " elements. " );
                break;
        default:
            System.out.println("Invalid selection.");
        
        }
        int tip = rand.nextInt(3);
        switch (tip) {
        case 0:
                System.out.println("Tip of  the Day: Factorials grow very fast; optimize your code for efficiency! ");
                break;
        
        case 1:    
                System.out.println("Tip of  the Day: The factorial of 0 is 1.");
                break;
        case 2:
                System.out.println("Tip of  the Day: Factorials are key to probability calculations." );
                break;
        }
        k.close();       
    }
}
