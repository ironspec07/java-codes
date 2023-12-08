import java.util.Scanner;

public class evenOddFun {

    public static void evenOdd(int n){
        if (n%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for even odd:  ");
        int n =  sc.nextInt();
        evenOdd(n);
        sc.close();
    }

}
