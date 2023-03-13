import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float [] num=new float[5];
        float sum=0;
        System.out.println("enter elements of array");
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextFloat();
            sum = sum+ num[i];
        }
        System.out.println("sum is ="+ sum);
    }
}
