
package Lab8_Class;



public class BankAccount {
    
    
    private String name;
    private String ic;
    private String passport;
    private double balance;
   
    
    public BankAccount(String name , String ic , String Passport , double initialDeposit ){
        
        this.name = name;
        this.ic = ic;
        this.passport = Passport;
        this.balance = initialDeposit;
    }
    
    public void deposit(double n){
       
        if(n>0){
        
            this.balance += n ;
            
        }
        
    }
    
    public void withdraw(double withdraw){
        
        if(withdraw> 0 && withdraw<= this.balance){
        
            this.balance -= withdraw ;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    
    
    public void balance(){
        System.out.println("The balance left : " + this.balance);
        
    }
    
}
