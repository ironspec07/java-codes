import java.util.Scanner;

public class elegibleVote {

    public static void vote(int age) {
        if (age >= 18) {
            System.out.println("Elegible To Vote");
        } else {
            System.out.println("Not Elegible To Vote");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age:  ");
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }
}
