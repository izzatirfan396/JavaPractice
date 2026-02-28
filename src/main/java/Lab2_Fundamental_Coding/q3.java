
package Lab2_Fundamental_Coding;


import java.util.Random ;
public class q3{
    public static void main (String[] args){
        Random rand = new Random();
        int range = 50 - 10 + 1; // (max - min + 1) + min
        int randomNum = rand.nextInt(range) + 10;
        int randomNum2 = rand.nextInt(range) + 10;
        int randomNum3 = rand.nextInt(range) + 10;
        int sum = randomNum + randomNum2 + randomNum3;
        double average = sum / 3.0;
        System.out.println("Random Number 1 :" + randomNum);
        System.out.println("Random Number 2 :" + randomNum2);
        System.out.println("Random Number 3 :" + randomNum3);
        System.out.println("Sum :" + sum);
        System.out.printf("AVerage : %.2f%n", average);
    }
}
