
package Lab6_Methods;
import java.util.Scanner;
import java.util.Random;
public class q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random rand = new Random();
        int score = 0 ;
        while(true){
            int numb1 = rand.nextInt(13);
            int numb2 = rand.nextInt(13);
           
            
            System.out.println("Enter negative number to quit.");
            System.out.print(numb1 + " x " + numb2 + " = ");
            int enter = k.nextInt();
            
            if(enter<0){
                break;
            }
            if(check(numb1,numb2,enter)){
                score+=1;
            }
            
        }
        System.out.println("Your score is "+ score);
    }
            public static boolean check(int numb1 , int numb2 , int enter){
                if(numb1*numb2 == enter){
                    return true;
            }
                else{
                    return false;
                }
            }
}




