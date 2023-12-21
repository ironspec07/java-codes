import java.util.Scanner;

public class PairsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
        }
        System.out.println("total pairs = "+tp);
        sc.close();
    }
}
