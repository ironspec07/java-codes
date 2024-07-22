
import java.util.*;

//find value of expressions
public class Strings {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        s=s.toLowerCase(); // string to lower case 
        System.out.println("String in lower case = "+s);

        int length=s.length(); // length of string
        System.out.println(length);

        s=s.replace(' ','_'); // replace method
        System.out.println("new string = "+s);

        String concatenated = s.concat(" Welcome"); // concat() method
        System.out.println("Concatenated String: " + concatenated);

        // Finding characters in a string
        char charAtIndex = s.charAt(2); // charAt() method
        System.out.println("Character at index 2 in String : " + charAtIndex);

        // Substring extraction
        String substring = s.substring(7); // substring() method
        System.out.println("Substring from index 7 of String : " + substring);

        // String comparison
        boolean isEqual = s.equals("hello, world!"); // equals() method
        System.out.println("Is String equal to 'hello, world!': " + isEqual);

        // String searching
        boolean contains = s.contains("gram"); // contains() method
        System.out.println("Does String contain 'gram': " + contains);

        sc.close();
    }
}
