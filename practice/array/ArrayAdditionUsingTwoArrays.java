package practice.array;

import java.util.Scanner;

public class ArrayAdditionUsingTwoArrays {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array :");
            int n = sc.nextInt();

            int []arr1 = new int[n];
            int []arr2 = new int[n];


            System.out.println("Enter the array elements for first array :");

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter the array elements for second array :");

            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = sc.nextInt();
            }

            int sum = 0;

            for (int i = 0; i < arr1.length; i++) {
                sum = arr1[i] + arr2[i];
                System.out.print(sum + " ");
                sum=0;
            }
        }
    }


