
package Lab4_Loop_For;
import java.util.Scanner;
public class q3{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int count = 0;
        double sum = 0, score , average , sumSquare , sd ;
        double min = Double.MAX_VALUE;
        double max =  -Double.MAX_VALUE;
        System.out.print("Enter a score [negative score to quit] :");
        score = k.nextDouble();
        sumSquare = 0 ;
        while(score>=0){
            count ++;
            sum += score;
            sumSquare = sumSquare + score*score ;
            
            if(score > max ){
            max = score ; 
            }
            if(score < min ){
            min = score ;
            }
            System.out.print("Enter a score [negative score to quit] :");
        score = k.nextDouble();
            
        } 
        if(count > 0){
        average = sum / count ; 
            System.out.println("Minimum Score : "+ min);
            System.out.println("Maximum Score : "+ max);
        System.out.printf("Average Score : %.2f%n", average);
        }
        if(count < 2){
            System.out.println("in order to have sd , count must be more than 1");
        }else{
        sd = Math.sqrt((sumSquare - ((sum*sum)/count))/ (count-1) ) ;
            System.out.printf("Standard deviation : %.2f%n", sd);
                }
        k.close();
    }
}
