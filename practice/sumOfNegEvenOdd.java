import java.util.Scanner;

public class sumOfNegEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("keep entring number till 0");
        int neg = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                neg += n;
            }
            else if (n%2 == 0) {
                even += n;
            }
            else{
                odd += n;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println("Sum of negative number is: " + neg);
        System.out.println("Sum of even number is: " + even);
        System.out.println("Sum of odd number is: " + odd);
        sc.close();
    }
}