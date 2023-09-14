package collectionframework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    String name;
    String address;

    public static void main(String[] args) {
        Employee obj1 = new Employee(14344,"Rajesh","Pune");
        Employee obj2 = new Employee(212,"Yogesh","Nagar");
        Employee obj3 = new Employee(312,"Suresh","Nanded");

        List<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        if(this.id == o.id){
            return 0;
        }
        else if(this.id > o.id){
            return 1;
        }
        else return -1;
    }
}
