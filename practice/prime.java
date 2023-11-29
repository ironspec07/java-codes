import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check for prime");
        int c=0;
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                c++;
            }

        }

        if(c==2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not A Prime Number");
        }
    }
}
