//kilometer to miles converter
import java.util.*;
public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter distance in kilometers");
        int dis=sc.nextInt();
        System.out.println("distance in miles = "+(dis/ 1.609));
    }
}
