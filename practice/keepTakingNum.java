import java.util.Scanner;

public class keepTakingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's x?");
        int x = sc.nextInt();
        System.out.println("keep entring number till x");
        while (true) {
            int n = sc.nextInt();
            if (n == x) {
                break;
            }
        }
        sc.close();
    }
}
