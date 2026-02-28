
package Lab5_Array;

import java.util.Scanner ;
public class q4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int [][] mtr = new int [3][3];
        System.out.println("Enter 3x3 matrix :");
        for(int i = 0 ; i <3; i ++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("At ["+i+"] ["+j+"] :");
                mtr[i][j] = k.nextInt();
                System.out.println();
            }
        }
        System.out.println("The original 3x3 matrix entered");
       for(int i = 0 ; i <3; i ++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(mtr[i][j]+ " ");
            }
            System.out.println();
        }
       int [][] mtrRotated = new int[3][3];
           for(int i = 0 ; i <3; i ++){
            for(int j = 0 ; j < 3 ; j++){
                mtrRotated [j][2-i] = mtr [i][j] ; 
            }
        }
           System.out.println("After rotates 90 degrees clockwise");
       for(int i = 0 ; i <3; i ++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(mtrRotated[i][j]+ " ");
            }
            System.out.println();
        }
        
        
    }
}
