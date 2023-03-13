import java.util.*;
public class fnction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-sum of odd numbers till n \n"+"2-greater number of two numbers \n"+"3-circumference from radius");
        System.out.println("4-eligible to vote \n"+"5-power of x to m");
        int n= sc.nextInt();
        switch (n){
            case 1:
                System.out.println("enter the no. till witch you want sum");
                int n1= sc.nextInt();
                System.out.println("sum = "+odd(n1));
                break;
            case 2:
                System.out.println("enter two number to compare for greater");
                double n2=sc.nextDouble();
                double n3=sc.nextDouble();
                System.out.println("grater no. is = "+greater(n2,n3));
                break;
            case 3:
                System.out.println("enter radius of circle ");
                double radius=sc.nextDouble();
                System.out.println("circumference of circle = "+circle(radius));
                break;
            case 4:
                System.out.println("enter age ");
                int age =sc.nextInt();
                if(vote(age)==1)
                    System.out.println("eligible for voting");
                else
                    System.out.println("not eligible");
                break;
            case 5:
                System.out.println("enter two numbers to find out power");
                double x=sc.nextDouble();
                double m=sc.nextDouble();
                System.out.println("power of x to m is = "+power(x,m));
                break;

            default:
                System.out.println("invalid input");

        }

    }
    public static int odd(int a){
        int sum=0;
        for(int i=1;i<=a;i+=2){
          sum=sum+i;

        }
        return sum;
    }
    public static double greater(double a,double b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static double circle(double a){
        double circum=2*3.14*a;
        return circum;
    }
    public static int vote(int a){
        if(a>18){
            return 1;
        }
        else
            return 0;
    }
    public static double power(double a,double b){
        return Math.pow(a,b);
    }

}
