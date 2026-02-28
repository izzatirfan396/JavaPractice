package Lab3_Selection_IfElse;
import java.util.Random;

public class q2 {
    public static void main (String [] args){
    Random rand = new Random();
    int range = 6;
    int randomNumber = rand.nextInt(range);
    switch (randomNumber){
        case 0 :
            System.out.println(randomNumber + " is zero");
            break;
        case 1 :
            System.out.println(randomNumber + " is one");
            break;    
        case 2 :
            System.out.println(randomNumber + " is two");
            break;    
        case 3 :
            System.out.println(randomNumber + " is three");
            break;    
        case 4 :
            System.out.println(randomNumber + " is four");
            break;    
        case 5 :
            System.out.println(randomNumber + " is five");
            break;    
        default:    
            System.out.println("OUT OF THE RANGE");
            
    }
    
    
    
    }
    
}
