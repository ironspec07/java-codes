import java.util.*;
public class powerOfTwo{
    public static void main(String[] args) {
        System.out.println("enter a number to check weather it is a power of 2");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0&&num%3!=0){
            System.out.println("power of 2");
        }
        else {
            System.out.println("not a power of two");
        }
    }
}
