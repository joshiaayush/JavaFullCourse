package practice.codechef;
import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++){
            int x = sc.nextInt();

            if (x == 0 || x % 3 == 0){
                System.out.println(0);
            }
            if (x % 3 == 1){
                System.out.println(2);
            }
            if (x%3 == 2){
                System.out.println(1);
            }

        }
    }
}
