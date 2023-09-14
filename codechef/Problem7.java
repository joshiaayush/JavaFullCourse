package practice.codechef;
import java.util.Scanner;
public class Problem7 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            int x = sc.nextInt();

            if(x<3){
                System.out.println("Less");
            }
            else if(x<7&&x>=3){
                System.out.println("Moderate");
            }
            else if(x>=7){
                System.out.println("Heavy");
            }
        }
    }
}
