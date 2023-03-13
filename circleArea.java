import java.util.*;
public class circleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius of circle in centimeter");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("area of circle is ="+area+"  centimeter square");
    }
}
