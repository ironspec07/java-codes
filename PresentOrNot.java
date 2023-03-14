import java.util.*;
public class PresentOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number and array ");
        int n =sc.nextInt();
        int c=0;
        int[] arr=new int[5];
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
            if (arr[i]==n)
                c++;

        }
        if (c>0)
            System.out.println("present");
        else
            System.out.println("not present");
    }
}
