package practice.problems;
//Write a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.Scanner;
public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
/*
        int g = 0;
        for (int i = 1; i <= a ; i++) {
            if(a%i == 0 && b%i == 0)
                g = i;
        }
        return g;
*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
