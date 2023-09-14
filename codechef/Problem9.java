package practice.codechef;
import java.util.Scanner;
public class Problem9 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            for(int j = 0; j<n;j++){
                int arr[] = new int [n];
                arr[j] = sc.nextInt();
                if(arr[j]>k){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
