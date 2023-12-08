import java.util.Scanner;

public class sumFun {
    public static void sum(int a, int b){
        System.out.println("Sum = "+ (a+b));
    }
    public static void pro(int a, int b){
        System.out.println("Product = "+ (a*b));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
        pro(a, b);
        sc.close();
    }
}
