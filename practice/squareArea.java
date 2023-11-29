import java.util.*;
public class squareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of square");
        double s = sc.nextDouble();
        double area = s*s;
        System.out.println("Area of square is :"+ area);
    }
}
