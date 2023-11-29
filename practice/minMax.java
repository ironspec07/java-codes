import java.util.*;
public class minMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] number=new int[n];
        System.out.println("enter the numbers in array");
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            number[i]=sc.nextInt();
            if(number[i]<max)
                max=number[i];
            else if(number[i]>min)
                min=number[i];

        }
        System.out.println("minimum value is ="+max+"\tmaximum value is="+min);


    }
}
