import java.util.Scanner;

public class BirnarySearch {
    public static int binarySearch(int numbers[],int key) {
        int start=0,end=numbers.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid]<key) {
                start =  mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
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
        System.out.println("index for key is :" + binarySearch(arr, a));
        sc.close();
    }
}
// time complexity = log n 