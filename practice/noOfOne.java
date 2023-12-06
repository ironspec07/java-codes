import java.util.*;
public class noOfOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check for number of ones");
        int c=0;
        int n=sc.nextInt();
        String bin=Integer.toBinaryString(n);
        System.out.println(bin);
        for(int i=0;i<bin.length();i++){
            System.out.println(bin.charAt(i));
            if(bin.charAt(i)=='1'){
                c++;
            }
        }
        System.out.println("no. of ones are "+c);
        sc.close();
    }
}
