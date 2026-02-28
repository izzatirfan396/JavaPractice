
package Lab8_Class;

import java.util.Scanner;


public class BankAccountTester {
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter name :");
        String name = k.next();
        
        System.out.println("Enter IC number :");
        String ic = k.next();
        
        System.out.println("Enter passport :");
        String passport = k.next();
        
        System.out.println("Enter deposit amount :");
        double depo = k.nextDouble();
        
        BankAccount BA = new BankAccount(name , ic , passport , depo );
        
        System.out.println("The balance in your account : ");
        BA.balance();
        
        while(true){
            
            System.out.println("Press 0 to stop this program , Press 1 to deposit money , Press 2 to withdraw money :");
            int choice = k.nextInt();
            
            
            if(choice == 0 ){
                break;
            }
            
            if(choice == 1){
            
            System.out.println("Enter the amount to deposit : ");
            depo = k.nextDouble();
            
            BA.deposit(depo);
            BA.balance();
            }
            
            if(choice == 2){
            
            System.out.println("Enter the amount to withdraw : ");
            double withdraw = k.nextDouble();
            
            BA.withdraw(withdraw);
            BA.balance();
            }
        }
        
        
    }
    
    
    
    
}
