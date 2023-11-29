import java.util.*;
public class binaryConversion {

    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of given binary number is "+decNum);
    }
    public static void decToBinary(int n){
        int pow=0;
        int binNum=0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary of given decimal number is "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to convert");
        int n = sc.nextInt();
        //binToDec(n);
        decToBinary(n);
    }
}
