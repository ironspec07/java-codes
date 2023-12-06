//hello name , have a good day
import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+", Have a good day");
        sc.close();
    }
}
