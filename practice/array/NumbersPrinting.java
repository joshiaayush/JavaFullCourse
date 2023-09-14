package practice.array;

import java.util.Scanner;

public class NumbersPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = x; i >= 0; i--) {
            System.out.print(i+ " ");
        }

    }
}