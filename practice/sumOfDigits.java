import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to calculate sum of digits");
        int n = sc.nextInt();
        int sum =0;
        while (n!=0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n=n/10;
        }
        System.out.println("sum of digits = " + sum);
        sc.close();
    }
}
