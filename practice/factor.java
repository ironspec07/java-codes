import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the number? ");
        int n = sc.nextInt();
        System.out.println("Factor's are :");
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
