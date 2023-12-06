import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number till which u want series");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a + " " + b);
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                temp = a + b;
                System.out.print(" " + temp);
                a = b;
                b = temp;
            }
        }
        sc.close();
    }
}
