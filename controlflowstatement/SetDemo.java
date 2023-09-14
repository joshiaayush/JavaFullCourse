package controlflowstatement;

import java.util.*;

public class SetDemo {
    int id;
    String name;
    String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetDemo setDemo = (SetDemo) o;
        return id == setDemo.id && name.equals(setDemo.name) && address.equals(setDemo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public SetDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public static void main(String[] args) {

        Set<SetDemo> set = new HashSet<>();
        SetDemo obj1 = new SetDemo(1,"Aayush", "Pune");
        SetDemo obj2 = new SetDemo(1,"Aayush", "Pune");
        SetDemo obj3 = new SetDemo(2,"Dake", "Mumbai");

        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });

    }
}
