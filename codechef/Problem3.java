package practice.codechef;
import java.util.Scanner;
public class Problem3 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int c = (100*A)/100;
            int d = (200*B)/100;

            if (100-c < 200-d){
                System.out.println("First");
            }
            else if (100-c > 200-d){
                System.out.println("Second");
            } else if (100-c == 200-d) {
                System.out.println("Both");
            }
        }
    }
}
