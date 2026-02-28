
package Lab6_Methods;

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
         Scanner k = new Scanner(System.in);
         
        int [] numb = new int[10];
        System.out.println("Enter 10 integers");
        for(int i=0 ; i<10 ; i++){
            System.out.print("Number "+ (i+1) +" :");
            numb[i]= k.nextInt();
        }    
            System.out.println("Original array");
            Printarr(numb);
            
            reversed(numb);
            System.out.println();
            System.out.println("Reversed array");
            Printarr(numb);
        
    }
    public static void reversed(int[] numb){
        for(int i = 0 ; i<10 ;i++){
            int ori = numb[i];
            int reversed = 0;
            while(ori!=0){
            int lastDigit = ori % 10;
            reversed = reversed*10 + lastDigit;
             ori = ori / 10 ;
            }
            numb[i]=reversed;
            
        }
        
    }
    public static void Printarr(int []numb){
        for(int i = 0 ; i<10 ; i++){
            System.out.print(numb[i]);
            System.out.print(" ");
            
        }
    }
    
}
