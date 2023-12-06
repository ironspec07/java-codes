import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check for Armstrong: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int arm = 0;
        while (n != 0) {
            int lastDigit = n%10;
            arm = (lastDigit*lastDigit*lastDigit) + arm ;
            n = n/10;
        }
        if (arm == temp) {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
}
