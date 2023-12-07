import java.util.Scanner;

public class compoundIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("initial principal balance? ");
        double p = sc.nextDouble();
        System.out.print("interest rate? ");
        double r = sc.nextDouble();
        System.out.print("number of times interest applied per time period? ");
        double n = sc.nextDouble();
        System.out.print("number of time periods elapsed? ");
        double t = sc.nextDouble();

        double a = p * (Math.pow((1 + (r / n)), (n * t)));
        System.out.println("final amount: " + a);
        System.out.println("Total Interest: " + (a - p));
        sc.close();

    }
}
