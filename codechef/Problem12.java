package practice.codechef;
import java.util.Scanner;
public class Problem12 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            double x = sc.nextInt();
            double y = sc.nextInt();

            double buyingPrice = x - y;

            double percent = (y/100)*10;
            //(int) Math.round(0.1 * x)

            System.out.println((percent+x)-buyingPrice);
        }
    }
}
