package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Employeeeeee {
    int id;
    String name;

    float f = 12;

    String address;
    public Employeeeeee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Employeeeeee obj1 = new Employeeeeee(1,"Pranav","Pune");
        Employeeeeee obj2 = new Employeeeeee(2,"Aayush","Nanded");
        Employeeeeee obj3 = new Employeeeeee(3,"Amey","Bhandara");


        List<Employeeeeee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
        
    }
}
