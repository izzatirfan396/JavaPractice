
package Lab4_Loop_For;
import java.util.Scanner ; 
public class q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int numb ;
        System.out.print("Enter an Integer :");
        numb = k.nextInt();
        System.out.print("The factors are : ");
        for(int i = 1 ; i<= numb ; i ++){
        if(numb % i == 0){
            System.out.print( i + "\t");
        }
        }
    }
}
