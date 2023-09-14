package practice.array;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        int []arr1 = new int[n];
        //Taking the input of array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j]){
                    count++;
                    if(count>2){
                        System.out.println(arr[i]);
                        count =0;
                    }
                }
            }
            if(count > 0){
                System.out.println(count);
            }
        }
    }
}
