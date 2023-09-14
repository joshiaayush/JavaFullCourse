package collectionframework;

import org.jetbrains.annotations.NotNull;

public class ComparatorDemo {
    int id;
    String name;
    String address;
    public static void main(String[] args) {
        Comparable<Integer> comparable = new Comparable<Integer>() {
            @Override
            public int compareTo(@NotNull Integer o) {
                return 0;
            }
        };
    }
}
