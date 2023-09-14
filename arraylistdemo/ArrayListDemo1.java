package practice.arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);
        System.out.println(arrayList.remove(3));
        System.out.println(arrayList);
    }
}
