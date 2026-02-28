
package Lab2_Fundamental_Coding;


import java.util.Scanner;
public class q2{
    public static void main (String[] args){
        Scanner k = new Scanner(System.in);
        double MonthlyPayment, CarPrice, DownPayment, InterestRate, LoanDuration;
        System.out.print("Enter the car price: ");
        CarPrice = k.nextDouble();
        System.out.print("Enter the down payment: ");
        DownPayment = k.nextDouble();
        System.out.print("Enter the interest rate (annual %): ");
        InterestRate = k.nextDouble();
        System.out.print("Enter the loan duration (in years): ");
        LoanDuration = k.nextInt();
        MonthlyPayment = (CarPrice - DownPayment) * (1 + (InterestRate / 100) * LoanDuration) / (LoanDuration * 12);
        System.out.printf("the monthly payment : %.2f%n", MonthlyPayment);
    }
}
