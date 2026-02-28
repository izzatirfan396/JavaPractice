package Lab3_Selection_IfElse;
import java.util.Scanner;
import java.util.Random;
public class q4 {
    public static void main (String[]args){
    Scanner k = new Scanner(System.in);
    Random rand = new Random();
    int p1roLL1, p1roLL2 , p2roLL1, p2roLL2, p1roll, p2roll ;
    p1roLL1 = rand.nextInt(6)+ 1 ;
    p1roLL2 = rand.nextInt(6) + 1;
    p1roll = p1roLL1 +  p1roLL2 ;
    System.out.println("RESULT FOR PLAYER 1 ROLL");
    System.out.println("FIRST ROLL :" + p1roLL1);
    System.out.println("SECOND ROLL :" + p1roLL2);
    System.out.println("TOTAL SCORE :" + p1roll);
    
    p2roLL1 = rand.nextInt(6)+ 1 ;
    p2roLL2 = rand.nextInt(6) + 1;
    p2roll = p2roLL1 + p2roLL2 ;
    System.out.println("RESULT FOR PLAYER 2 ROLL");
    System.out.println("FIRST ROLL :" + p2roLL1);
    System.out.println("SECOND ROLL :" + p2roLL2);
    System.out.println("TOTAL SCORE :" + p2roll);

    if(p1roll > p2roll){
    System.out.println("PLAYER 1 WIN");
    }
    else if(p2roll > p1roll){
        System.out.println("PLAYER 2 WIN");
    }
    else{
        System.out.println("IT IS TIE");
    }
    
    
    
    
    }
    
    
    
}
