package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class MulOdArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for (int i = 0,j=list2.size()-1; i < list1.size(); i++,j--) {
            System.out.print(list1.get(i)*list2.get(j));
        }
    }
}
