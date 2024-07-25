import java.util.*;
public class RotatedArr {
    static int rotated(int[] num , int target){
        for (int i = 0; i<num.length;i++) {
            if (num[i]==target) {
                return i;
            }
        }
        return -1;
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
        System.out.println("enter target");
        int target =sc.nextInt();
        int result = rotated(num,target);
        System.out.println(result);
        sc.close();
    }
}
