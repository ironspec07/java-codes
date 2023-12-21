// Arrays are contiguous memory locations
package lectures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an array:-
        int marks[] = new int[3];
        // int numbers[] = { 1, 2, 3 };
        // String fruits[] = { "apple", "bananna" };

        // taking marks input:-
        System.out.println("Enter marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        // updating and printing marks:-
        System.out.println("updated marks:-");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + 1);
        }
        sc.close();
    }

}