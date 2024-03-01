import java.util.*;
public class Cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of three subject out of 100");
        byte a=sc.nextByte();
        byte b=sc.nextByte();
        byte c=sc.nextByte();
        if(a<=100&&b<=100&&c<=100)
        System.out.println("cgpa is:- "+(double)((a+b+c)/30));
        else
            System.out.println("invalid marks!!");
        sc.close();
    }
}
