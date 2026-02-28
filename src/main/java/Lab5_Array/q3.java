
package Lab5_Array;

import java.util.Scanner;
import java.util.Random; 

public class q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random rand = new Random();
        
        int [] day = new int[7];
        int N ;
        System.out.print("Enter number of employee : ");
        N = k.nextInt();
        System.out.println();
        int Sum = 0 ;
        int b = 0 ;
        for(int i = 1 ; i<=N ; i++){
            System.out.println("Employee "+ i + " :");
        for(int j = 0 ; j<day.length ; j++){
            int hours = rand.nextInt(8)+1;
            day[j]= hours ; 
           b +=  1;
           Sum += hours ;
            System.out.print("Day "+ b + " :" + day[j] );
            System.out.println();
             
        }
            System.out.println("The total hours work for employee "+ i + " :" + Sum);
            b=0;
            Sum = 0;
        }
    }
        
    
}
