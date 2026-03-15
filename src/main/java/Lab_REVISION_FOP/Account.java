/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_REVISION_FOP;

/**
 *
 * @author Izzat
 */

import java.util.Date ;
public class  Account {
    private int id   ;
    private double balance  ;
    private double annualInterestRate  ;
    private Date dateCreated ; 
    
    public Account(int id , double balance){
        this.id = id ;
        this.balance = balance ;
        this.dateCreated = new Date();
    }
    
    public Account(){
        this(0,0);
    }
    
    public void setId(int id){
        this.id = id ;
    }
    
    public int getId(){
        return id ;
    }
    
    public void setBal(double balance){
        this.balance = balance ;
    }
    
    public double getBal(){
        return balance ;
    }
    
    public void setAIR(double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100 ;
    }
    
    public double getAIR(){
        return annualInterestRate ;
    }
    
    public Date getDate(){
        return dateCreated ;
    }
    
    public double getMonthlyInterestRate(){
        double MIR = annualInterestRate /12 ;
        return MIR ;
    }
    
    public double getMonthlyInterest(){
        double MI = balance * (annualInterestRate/12);
        return MI ; 
    }
    
    public boolean withdraw(double amountW){
       if(amountW > balance){
           return false;
       }
       balance -= amountW ; 
       return true ;
    }
    
    public boolean deposit(double amountD){
        if(amountD < 0){
            return false ;
        }
        balance += amountD ;
        return true ;
    }
    
    public void printInfo(){
       
        System.out.println("Account info : " );
        System.out.println("Balance : " + this.getBal());
        System.out.println("Monthly Interest : " + this.getMonthlyInterest() );
        System.out.println("Data created : "+ this.getDate());
        
    }
}
