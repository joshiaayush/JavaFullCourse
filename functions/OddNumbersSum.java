package practice.functions;
import java.util.Scanner;
public class OddNumbersSum {
    public int n;

    public static int sum(int n){
        int x = 0;
        for (int i = 1; i <=n ; i++) {
            if(i%2 == 1){
                x += i;
            }
        }
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        sum(n);
    }

}
