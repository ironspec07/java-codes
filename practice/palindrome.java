import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check for palindrome");
        int n = sc.nextInt();
        int temp=n;
        int rev =0;
        while (n!=0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        if (temp==rev)
            System.out.println("palindrome number");
        else
            System.out.println("not a palindrome number");
            sc.close();
    }
}
