import java.util.*;
public class checkPostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        int n = sc.nextInt();
        if (n>0)
            System.out.println("positive number");
        else if (n<0)
            System.out.println("negative number");
        else
            System.out.println("zero");
    }
}
