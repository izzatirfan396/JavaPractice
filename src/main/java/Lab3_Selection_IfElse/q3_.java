package Lab3_Selection_IfElse;


    import java.util.Scanner;
    public class q3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales volume:");
        int sales = sc.nextInt();
        double commission = 0.0;

        if (sales > 0) {
            int remaining = sales;

            if (remaining > 1000) {
                commission += (remaining - 1000) * 0.125;
                remaining = 1000;
            }
            if (remaining > 500) {
                commission += (remaining - 500) * 0.10;
                remaining = 500;
            }
            if (remaining > 100) {
                commission += (remaining - 100) * 0.075;
                remaining = 100;
            }
            if (remaining > 0) {
                commission += remaining * 0.05;
            }
        } else {
            commission = 0;
        }

        System.out.printf("The commission is: %.2f", commission);
        sc.close();
    }}
