package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);


        List<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(20);
        list2.add(30);
        list2.add(80);
        list2.add(90);


        list1.addAll(list2);
        list1.removeAll(list2);
        list1.add(2, 22);

        System.out.println(list1);


    }
}
