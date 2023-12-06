import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers and a operator ");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        char o =sc.next().charAt(0);
        switch (o){
            case '+':
                System.out.println("sum is ="+a+b);break;
            case '-':
                System.out.println("difference is ="+(a-b));break;
            case'*':
                System.out.println("product is ="+(a*b));break;
            case'/':{
                if(b==0){
                    System.out.println("math error");
                }
                else {
                    System.out.println("quotient is ="+(a/b));
                }break;
            }
            case'%':{
                if(b==0){
                    System.out.println("math error");
                }
                else {
                    System.out.println("remainder is ="+(a%b));
                }break;
            }


        }
        sc.close();
    }
}
