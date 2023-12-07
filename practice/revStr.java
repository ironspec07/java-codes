import java.util.Scanner;

public class revStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to be reversed:  ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev ;
        }
        System.out.println("reversed string is : "+ rev);
        sc.close();
    }
}
