package practice.codechef;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        {
            // your code goes here
            Scanner sc = new Scanner (System.in);
            int t = sc.nextInt();

            for(int i =0; i < t; i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int count = 1;
                int num = r-l+1;
                if(l==r){
                    System.out.println(1);
                }
                else if(l<r){
                    count = num*(num+1)/2;
                    }
                    System.out.println(count);
                }
            }
        }
    }

