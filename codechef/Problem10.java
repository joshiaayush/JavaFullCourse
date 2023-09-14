package practice.codechef;
import java.util.Scanner;
public class Problem10 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a<=b){
                a = a+c;
                if(a<=b){
                    a = a+d;
                }
                else b = b+d;
            }
            else if(a>b){
                b = b+c;
                if(a<=b){
                    a = a+d;
                }
                else b = b+d;
            }



            if(a>=b){
                System.out.println("N");
            }
            else System.out.println("S");
        }
    }
}
