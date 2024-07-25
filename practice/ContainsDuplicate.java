import java.util.Arrays;
import java.util.*;
public class ContainsDuplicate {
    static boolean isDuplicate(int[] num){
        Arrays.sort(num);
        for (int j : num) {
            System.out.println(num[j]);
        }
        for (int i = 0 ; i < num.length-1 ; i++) {
            System.out.println(num[i]);
            if (num[i] == num[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int[] num = new int[n];
        for (int i : num) {
            num[i] = sc.nextInt();
        }
        boolean result = isDuplicate(num);
        System.out.println(result);
        sc.close();
    }
}
