import java.util.*;
public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers to check for gcd");
        int a=sc.nextInt();
        int b= sc.nextInt();
        while(b!=0){
            if (a>b){
                a=a-b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("GCD is= "+ a);
        sc.close();
    }
}
