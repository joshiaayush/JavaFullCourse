package practice.problems;
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int [] arr = new int [n];
//        int num = 0;
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
