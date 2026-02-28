
package Lab4_Loop_For;
import java.util.Scanner;
import java .util.Random;
public class q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner k = new Scanner(System.in);
        int roll , totalScore1 , totalScore2 ;
        totalScore1 = 0;
        totalScore2 = 0;
        while(totalScore1 <= 100 && totalScore2 <= 100){
            
            System.out.println("Player 1 turn : ");
            
            do{
                System.out.print("Press 1 to start rolling :");
                k.nextInt();
                roll = rand.nextInt(6) + 1;
                totalScore1 += roll ;
                System.out.println("Player 1 rolled a : "+ roll);
                System.out.println("Player 1 total score : "+ totalScore1 );
                
                if(totalScore1 > 100){
                break;
                }
                if(roll == 6){
                    System.out.println("YOU GOT A 6 , YOU CAN ROLL AGAIN");
                }
            }while(roll==6);
            System.out.println();
            System.out.println("Player 2 turn : ");
            
            do{
                System.out.print("Press 1 to start rolling :");
                k.nextInt();
                roll = rand.nextInt(6) + 1;
                totalScore2 += roll ;
                System.out.println("Player 2 rolled a : "+ roll);
                System.out.println("Player 2 total score : "+ totalScore2 );
                
                if(totalScore2 > 100){
                break;
                }
                if(roll == 6){
                    System.out.println("YOU GOT A 6 , YOU CAN ROLL AGAIN");
                }
            }while(roll==6);
            System.out.println();
        }
        if(totalScore1 > totalScore2){
            System.out.println("Player 1 score is " + totalScore1);
            System.out.println("Player 2 score is " + totalScore2);
            System.out.println("Player 1 win !!");
        }else{
        System.out.println("Player 1 score is " + totalScore1);
            System.out.println("Player 2 score is " + totalScore2);
            System.out.println("Player 2 win !!");
        }
    }
    
}
