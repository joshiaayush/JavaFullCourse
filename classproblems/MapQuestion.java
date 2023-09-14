package classproblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapQuestion {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        HashMap<Integer,Integer> map3 = new HashMap<>();

        map1.put(1,10);
        map2.put(1,190);
        map3.put(1,190);
        map1.put(2,190);
        map2.put(2,140);
        map3.put(2,140);
        map1.put(3,140);
        map2.put(3,940);
        map3.put(3,90);
        map1.put(4,90);
        map2.put(4,90);
        map3.put(4,970);
        map1.put(5,170);
        map2.put(5,170);
        map3.put(5,170);
        map1.put(6,10);
        map2.put(6,50);
        map3.put(6,50);
        map1.put(7,50);
        map2.put(7,10);
        map3.put(7,10);

        LinkedList<HashMap<Integer, Integer>> list = new LinkedList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);


        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println("Key-> "+k+" Value->"+v);
            });

        });


    }
}
