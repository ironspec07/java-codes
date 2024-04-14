import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        // Iterate through the array
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i; // Assume the current element is the minimum

            // Find the minimum element in the remaining unsorted portion of the array
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; // Update the position of the minimum element
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the size of the array?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        sc.close();
    }
}
