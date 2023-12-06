
import java.util.*;

//find value of expressions
public class Strings {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        System.out.println("String in lower case = "+s);
        int length=s.length();
        System.out.println(length);
        s=s.replace(' ','_');
        System.out.println("new string = "+s);
        sc.close();
    }
}
