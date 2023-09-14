package practice.array;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();


        System.out.println("enter array elements :");

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                a.add(arr[i]);
            }
            else b.add(arr[i]);
        }
        System.out.println("Even elements");
        System.out.println(a);
        System.out.println("Odd elements");
        System.out.println(b);
    }

}
