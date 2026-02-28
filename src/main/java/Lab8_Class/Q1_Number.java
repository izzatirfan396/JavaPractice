
package Lab8_Class;

import java.util.Random;


public class Q1_Number {

    
private int[] numb ; 
private Random rand;    
    
public Q1_Number(){
    
   this(10,100); //the word "this(....)" = Call ANOTHER constructor of the SAME class.(which refer to the constructor that do the randomising
    
}

public Q1_Number(int n){
    
    this(n,100);
}

public Q1_Number(int n , int max){
    
    numb = new int[n];
    rand = new Random();
    
    for (int i = 0; i < numb.length ; i++) {
        numb[i]= rand.nextInt(max+1);
    }
}

public void Display(){
    
    for (int i = 0; i < numb.length ; i++) {
        System.out.print(numb[i] + " ");
    }
    System.out.println();
}

public void Even(){
    System.out.println("The even number : ");
    for (int i = 0; i < numb.length ; i++) {
        
        if(numb[i]%2 == 0){
            
            System.out.print(numb[i] + " ");
            
        }
        
    }
    System.out.println();
}

public void Prime(){
    System.out.println("The prime number : ");
    for (int i = 0; i < numb.length; i++) {
        
        int number = numb[i];
        
        if(number<=1){
            continue ; 
        }
        
        boolean prime = true ;
        
        
    for (int j = 2 ; j <= Math.sqrt(numb[i]) ; j++){
        if(number%j==0){
            prime = false ;
            break;
        }
       
    }
     if(prime){
            System.out.print(number + " ");
            
        }
    }
    
    System.out.println();
}

public void Max(){                                                                            /* ALTERNATIVE WITHOUT SORTINGGGGG
    public void Max() {
    int max = numb[0];

    for (int i = 1; i < numb.length; i++) {
        if (numb[i] > max) {
            max = numb[i];
        }
    }

    System.out.println("The maximum number : " + max);
}

    */
    
    for (int i = 0; i < numb.length - 1; i++) {
        for (int j = 0; j < numb.length - 1 - i; j++) {
            if(numb[j] > numb[j+1]){
                int temp = numb[j];
                numb [j] = numb[j+1];
                numb [j+1] = temp;
            }
        }
    }
    
    System.out.println("The maximum number : " + numb [numb.length - 1]);
    
}

public void Min(){
        
    System.out.println("The minimum number : " + numb [0]);
  
            }
      
public void Average(){
     
    int sum = 0 ;
    for (int i = 0; i < numb.length ; i++) {
        
        sum += numb[i];
        
    }
    
    System.out.println("The average : " + ((double)sum/numb.length));
    
}    

public void Square(){
    System.out.println("The square number");
    
    for (int i = 0; i < numb.length; i++) {
        int root = (int) Math.sqrt(numb[i]);
        if (root * root == numb[i]) {
            System.out.print(numb[i] + " ");
        }
    }
    System.out.println();
}

    
}
    



