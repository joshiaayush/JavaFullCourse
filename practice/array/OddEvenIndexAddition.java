package practice.array;
import java.util.Scanner;
public class OddEvenIndexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sumEven =0;
        for (int i = 0; i < arr.length; i+=2) {
            sumEven += arr[i];
        }
        System.out.println("The Even sum is :"+sumEven);

        int sumOdd =0;
        for (int i = 1; i < arr.length; i+=2) {
            sumOdd += arr[i];
        }
        System.out.println("The odd sum is :"+sumOdd);
    }
}
