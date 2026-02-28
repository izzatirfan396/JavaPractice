package Lab3_Selection_IfElse;
import java.util.Scanner;
public class q3 {
    public static void main ( String [] args){
    Scanner k = new Scanner(System.in);
    int SV ;
    double Comm ; 
    System.out.println("Enter the Sales Volume : ");
    SV = k.nextInt();
    if(SV <= 100 ){
        Comm = 0.05 * SV;
        System.out.println("The commision you get is 5%");
        System.out.printf("The commision from the sale : %.2f" , Comm );
    }
    else if((SV > 100) && (SV <= 500) ){
    Comm = 0.075 * SV;
        System.out.println("The commision you get is 7.5%");
        System.out.printf("The commision from the sale : %.2f" , Comm );
    }
    else if((SV > 500)&& (SV<=1000)){
    Comm = 0.1 * SV;
        System.out.println("The commision you get is 10%");
        System.out.printf("The commision from the sale : %.2f" , Comm );
    }
    else if(SV > 1000){
    Comm = 0.125 * SV;
        System.out.println("The commision you get is 12.5%");
        System.out.printf("The commision from the sale : %.2f" , Comm );
    }
    
    }
}
