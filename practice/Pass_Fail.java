import java.util.*;
public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of three subjects out of 100");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < 100 && b < 100 && c < 100) {
            if (a >= 33 && b >= 33 && c >= 33) {
                if ((a + b + c) > 120)
                    System.out.println("pass");
                else
                    System.out.println("fail");
            } else {
                System.out.println("fail");
            }

        }
        else
            System.out.println("invalid input");
            sc.close();
    }
}
