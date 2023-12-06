import java.util.*;

public class lcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers to find LCM and HCF");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int hcf = a;
        while (a != 0) {
            if (a % hcf == 0 && b % hcf == 0) {
                System.out.println("HCF is: " + hcf);
                break;
            } else {
                hcf--;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println("LCM is : " + lcm);

    }
}
