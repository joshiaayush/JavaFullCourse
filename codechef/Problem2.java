package practice.codechef;
import java.util.Scanner;
public class Problem2 {
    public static void main (String[] args) throws java.lang.Exception

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i< n; i++){
            int X = sc.nextInt();
            int H = sc.nextInt();
            if (X>=H){
                System.out.print("Yes");
            }
            else System.out.print("No");
        }
        System.out.println();
    }
}
