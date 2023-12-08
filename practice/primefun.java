import java.util.Scanner;

public class primefun {

    public static void prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int c  = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        prime(a, b);
        sc.close();
    }
}
