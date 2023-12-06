import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        //A year is a leap year if the following conditions are satisfied:
        //The year is multiple of 400.
        //The year is multiple of 4 and not multiple of 100
        if(year%4==0&&year%100!=0){
            System.out.println("year is leap year");
        }
        else
            System.out.println("year is non leap year");
            sc.close();
    }
}
