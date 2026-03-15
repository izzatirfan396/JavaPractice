/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_REVISION_FOP;

/**
 *
 * @author Izzat
 */
public class testerAccount {
    public static void main(String[] args) {
        
    Account acc = new Account(1122 , 20000);
    acc.setAIR(4.5); 
    acc.withdraw(2500);
    acc.deposit(3000);
    acc.printInfo();
}
}