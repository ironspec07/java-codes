import java.util.Scanner;

public class conVow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count no. of consonents and vowel:  ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int con = 0; int  vow = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
                vow++;
            } else if (str.charAt(i) == ' ') {
                continue;
            }else {
                con++;
            }
        }
        System.out.println("Number of consonents is: "+con);
        System.out.println("Number of vowel is: "+vow);
        sc.close();
    }
}
