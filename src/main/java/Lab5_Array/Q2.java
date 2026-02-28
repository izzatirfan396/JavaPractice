
package Lab5_Array;

import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numb = new int [10];
        
        
        for (int i = 0 ; i<10 ; i++){
        numb [i] = rand.nextInt(21);
        
        for (int j = 0 ; j < i ; j++){
            if ( numb [i] == numb [j]){
            i -= 1 ;
            break;
            }
            
        }
        }
        for (int k = 0 ; k<10 ; k++){
            System.out.print(numb [k] + " ");
        }
    }
}
