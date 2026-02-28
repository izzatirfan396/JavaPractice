
package Lab5_Array;

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       
        System.out.println("Enter the number of row of Pascal Triangle to generate: ");
        int n = k.nextInt();
        int [][]mtr = new int[n][n]; // this already produce matrix n by n with all the number is 0 
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(j==0){
                    mtr[i][j]=1 ;
                }else{
                    mtr[i][j] = mtr[i-1][j-1] + mtr[i-1][j];    
                } 
            }
        }
        
        System.out.println("The Pascal Triangle with "+ n + " row(s)");
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(mtr[i][j] + " ");
                
            }
            System.out.println();
        }
        
    }
}
