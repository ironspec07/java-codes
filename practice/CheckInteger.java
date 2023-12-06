//program to check for integer
import java.util.*;
public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        double a=sc.nextDouble();
        if(a == (int)a)
            System.out.println("is integer");
        else
            System.out.println("not integer");
        sc.close();
    }
}
