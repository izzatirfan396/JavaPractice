
package Lab3_Selection_IfElse;

import java.util.Scanner;
public class q1 {
    public static void main(String [] args){
    Scanner k = new Scanner(System.in);
    int numb1 , numb2 ;
    char oper ; 
    System.out.println("Enter 1st number :");
    numb1 = k.nextInt();
    System.out.println("Enter 2nd number :");
    numb2 = k.nextInt();
    System.out.println("Enter a symbol operation (+,-,*,/,%) ");
    oper = k.next().charAt(0); //take the first character of the string@word
    int SUM = numb1 + numb2 ;
    int SUBTRACTION = numb1 - numb2 ;
    int MULTI = numb1*numb2 ; 
    switch(oper){
        case '+' :
                System.out.println(numb1 + " " + oper + " " + numb2 + " =" + SUM);
                break;
        case '-':
                System.out.println(numb1 + " " + oper + " " + numb2 + " =" + SUBTRACTION);
                break;        
        case '*':
                 System.out.println(numb1 + " " + oper + " " + numb2 + " =" + MULTI);
                break; 
        case '/':
            if(numb2 != 0){
                int DIV = numb1/numb2 ;
                 System.out.println(numb1 + " " + oper + " " + numb2 + " =" + DIV);}
            else {
                System.out.println("INVALID BOSS");}
                break;
        case '%':
            if(numb2 != 0){
                int REMAIN = numb1 % numb2 ;
                 System.out.println(numb1 + " " + oper + " " + numb2 + " =" + REMAIN);}
            else{
                System.out.println("INVALID BOSS");}
                break;        
        default : System.out.println("INVALID OPERATOR");        
            
    }       
    }
    }
    

