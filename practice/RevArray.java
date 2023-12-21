import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
