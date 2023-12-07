import java.util.Scanner;

public class batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Runs? ");
        double runs = sc.nextDouble();
        System.out.print("Total Dismisals? ");
        double out = sc.nextDouble();

        System.out.println("Batting Avg is :" + (runs / out));
        sc.close();
    }
}
