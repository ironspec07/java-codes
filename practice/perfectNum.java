import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for perfect number:  ");
        int n = sc.nextInt();
        int sumfact = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sumfact = sumfact + i;
            }
        }
        if (sumfact == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect number");
        }
        sc.close();
    }
}
