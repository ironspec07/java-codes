import java.util.*;
public class costOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter cost of pen,pencil,eraser");
        float pen= sc.nextFloat();
        float pencil= sc.nextFloat();
        float eraser= sc.nextFloat();
        float totalCost = pen+pencil+eraser;
        System.out.println("total cost = "+ totalCost);
        float finalTotalCost = totalCost+0.18f *totalCost;
        System.out.println("total cost with gst = " + finalTotalCost);
    }
}
