package practice.array;
//import Scanner class

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //make object of Scanner class as sc
        Scanner sc = new Scanner(System.in);

        //input the size of array from user
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();

        //make array of size n
        int[] arr = new int[n];

        //Fill the array
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("The array elements are :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("The addition of array elements is :" + sum);
    }

}
