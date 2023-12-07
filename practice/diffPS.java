import java.util.Scanner;

public class diffPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while (n != 0) {
            int lastdig = n % 10;
            sum += lastdig;
            pro *= lastdig;
            n /= 10;
        }
        System.out.println("Difference between product and sum is :" + (pro - sum));
        sc.close();
    }
}
