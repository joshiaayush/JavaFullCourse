package practice.functions;
import java.util.Scanner;
public class Factorial {
    public static void fact(int n){

        if(n<0){
            System.out.println("Invalid number..........");
            return;
        }

        int sum = 1;
        for (int i = n; i >=1 ; i--) {
            sum = sum*i;
        }
        System.out.println("Factorial of given number is :"+sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }

}
