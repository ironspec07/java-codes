import java.util.Scanner;

public class DupliArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("true");
                }
            }
        }
        sc.close();
    }
}
