package practice.codechef;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0;i<t;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}
