
package Lab4_Loop_For;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int n ;
        int i ,j ;
        int totalSum = 0;
        System.out.println("Enter the number n :");
        n = k.nextInt();
        for( i = 1 ; i <= n ; i++){
            int InnerSum = 0  ;
            for( j=1 ; j <= i ; j++){
                InnerSum = InnerSum + j ; 
            }
            totalSum = totalSum + InnerSum;
        }
        System.out.println("The sum of the series : " + totalSum);
    }
}
