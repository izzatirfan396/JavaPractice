
package Lab5_Array;
import java.util.Scanner;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int numb ; 
        System.out.println("enter number of students : ");
        numb = k.nextInt();
        Random rand = new Random();
        int range = 101 ; 
        int [] score = new int[numb];
        System.out.println("List of scores for "+ numb + " Students :");
        for(int i = 0 ; i < numb ; i++){
        score[i] = rand.nextInt(range);
            System.out.print(score[i] + " ");
        }
            System.out.println();
        for (int j = 0 ; j < score.length - 1 ; j++){
           for (int m = 0 ;  m<score.length - 1 - j ; m++){
           if(score[m]>score[m + 1]){
           int temp = score[m];
           score[m]= score[m+1];
           score[m+1]=temp;
           }
           }
        }
        System.out.println("The highest score is : "+ score [score.length - 1]);
        System.out.println("The lowest score is : "+ score [0]);
        int sum =0;
        
        for (int o = 0 ; o < score.length ; o++){
             sum += score[o];
        }
        double avg = (double) sum / score.length;
        System.out.println("The average score is : " + avg );
       
        
    }
    
}
