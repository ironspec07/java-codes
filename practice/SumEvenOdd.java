import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of inputs");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (a%2==0) {
                sumEven = sumEven + a;
            }
            else{
                sumOdd = sumOdd + a;
            }
        }
        System.out.println("Sum of Even entries: " + sumEven);
        System.out.println("Sum of Odd entries: " + sumOdd);
        sc.close();
    }
}
