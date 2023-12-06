import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print factorial");
        long n= sc.nextLong();
        long factorial=1;
        for (int  i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of given number is ="+factorial);
        sc.close();
    }
}
