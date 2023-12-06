import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 3 no. to calculate avg");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double av=average(a,b,c);
        System.out.println("average of given numbers is = "+ av );
        sc.close();

    }
    public static double average(double n1,double n2,double n3){
        double av =(n1+n2+n3)/3;
        return av;
        
    }
}
