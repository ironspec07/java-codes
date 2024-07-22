import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String str = "WHEEL";
        printPermutations(str);
    }

    public static void printPermutations(String str) {
        // Step 1: Sort the string
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);

        // Step 2: Obtain the total number of permutations
        int totalPermutations = factorial(str.length());
        System.out.println("Total Permutations:"+totalPermutations);
        // Step 3: Print the sorted string and then loop for the number of (permutations-1) times
        System.out.println("Permutations:");
        System.out.println(sortedString);
        for (int i = 1; i < totalPermutations; i++) {
            nextPermutation(charArray);
            System.out.println(new String(charArray));
        }
    }

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Function to generate next lexicographic permutation
    public static void nextPermutation(char[] charArray) {
        int i = charArray.length - 2;
        while (i >= 0 && charArray[i] >= charArray[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = charArray.length - 1;
            while (charArray[j] <= charArray[i]) {
                j--;
            }
            swap(charArray, i, j);
        }
        reverse(charArray, i + 1);
    }

    // Function to swap two characters
    public static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

    // Function to reverse a portion of the array
    public static void reverse(char[] charArray, int start) {
        int i = start, j = charArray.length - 1;
        while (i < j) {
            swap(charArray, i, j);
            i++;
            j--;
        }
    }
}
