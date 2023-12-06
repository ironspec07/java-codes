import java.util.*;
public class CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check for power of two");
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.println(i);
            if (n == (int) Math.pow(2, i)) {
                System.out.println("true");
                break;
            }

        }
        System.out.println((int) Math.pow(2, i));
        if (i == n - 1 && n != (int) Math.pow(2, i))
            System.out.println("false");
    }
}
