import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            else if (arr[i]<min) {
                min = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println("Maximum Array element = "+max);
        System.out.println("Manimum Array element = "+min);
        sc.close();
    }
}
