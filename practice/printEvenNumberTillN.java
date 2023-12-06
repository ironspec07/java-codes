import java.util.*;
public class printEvenNumberTillN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number till which you have to print even number");
        int n=sc.nextInt();
        System.out.println("even numbers till "+n+" are");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
