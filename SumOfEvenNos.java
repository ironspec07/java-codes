import java.util.*;
public class SumOfEvenNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number till which you want sum of even nos");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("sum is ="+ sum);
    }
}
