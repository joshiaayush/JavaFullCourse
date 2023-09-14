//package practice.functions;
////Two numbers are entered by the user, x and n. Write a function to find the value of one number
//// raised to the power of another i.e. xn.
//import java.util.Scanner;
//public class PowerOfNumber {
//    public static void pow(int x , int n){
//        System.out.println(Math.pow(x,n));
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int x = sc.nextint();
//        System.out.println("Enter a number to calculate the power of "+x);
//        int n = sc.nextint();
//
//        pow(x,n);
//    }
//}
package practice.functions;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number
// raised to the power of another i.e. xn.
import java.util.Scanner;
public class PowerOfNumber {
    public static void pow(int x , int n){
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= x;
        }
        System.out.println(x + " to the power of " + n + " is " + result);    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        System.out.println("Enter a number to calculate the power of "+x);
        int n = sc.nextInt();
        pow(x,n);
    }
}
