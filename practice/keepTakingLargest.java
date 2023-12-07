import java.util.Scanner;

public class keepTakingLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("keep entring number till 0");
        int larg = 0;
        while (true) {
            int n = sc.nextInt();
            if (n > larg) {
                larg = n;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println("Largest number is: " + larg);
        sc.close();
    }
}
