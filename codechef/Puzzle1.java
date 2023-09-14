package practice.codechef;
import java.util.Scanner;
public class Puzzle1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            if(a == b){
                System.out.println(0);
            }else{
                int s= b /a;
                System.out.println(s);
            }

        }
    }
}
