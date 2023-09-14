package practice.recursion;
import java.util.Scanner;
public class Factorial {

    public static void fact(int i, int n, int sum){
        if(i == n){
            sum*=i;
            System.out.println(sum);
            return;
        }
        sum*=i;
        fact(i+1,n,sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();


    }
}
