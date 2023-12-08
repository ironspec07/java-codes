import java.util.Scanner;

public class pythagoreanTriplet {
    public static void triplet(int a,int b,int c){
        a = a*a; b = b*b; c = c*c;
        if ((a+b)==c) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not A Pythagorean Triplet");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triplet(a,b,c);
        sc.close();
    }
}
