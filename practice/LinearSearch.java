import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the nnumber to search");
        int a = sc.nextInt();
        if (linearSearch(arr, a) == -1) {
            System.out.println("Number Not found");
        }
        else{
            System.out.println("Number found at index:" + linearSearch(arr, a));
        }
        sc.close();
    }

    public static int linearSearch(int arr[], int a) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }
}
