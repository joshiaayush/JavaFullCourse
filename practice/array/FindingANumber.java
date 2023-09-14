package practice.array;
import java.util.Scanner;
public class FindingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter which element to be searched :");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == search){
                System.out.println("Your element is at "+i+" location");
            }
        }
    }
}
