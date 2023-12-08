import java.util.Scanner;

public class factorialfunc {
    
    public static void fact(int n){
        long factorial=1;
        for (int  i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of given number is ="+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number to calculate factorial:  ");
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }
}
