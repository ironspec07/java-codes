import java.util.*;
public class sign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs ");
        int n=sc.nextInt();
        int a=0;
        int b=0;
        int c=0;
        for (int i=1;i<=n;i++){
            int n1= sc.nextInt();
            if(n1<0){
                c++;
            } else if (n1>0) {
                b++;

            }
            else
                a++;
        }
        System.out.println("number of +ve numbers are = "+b );
        System.out.println("number of -ve numbers are = "+c);
        System.out.println("number of zeros are = "+a);
    }
}
