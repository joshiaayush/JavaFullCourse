package practice.problems;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
// negative and zeros entered.
import java.util.Scanner;
public class CountPosNigZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to insert :");
        int num = sc.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 1; i <= num ; i++) {
            System.out.println("Enter number "+i+" :");
            int n = sc.nextInt();
            if(n == 0){
                zero ++;
            }
            else if (n>0) {
                positive ++;
            }
            else {
                negative ++;
            }
        }
        System.out.println("Number of zeros are :"+zero+" Number of positives are : "+positive +" Number of negatives are : "+negative);
    }
}
