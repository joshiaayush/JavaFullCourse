package java8;

import java.util.Optional;
//handle null pointer exception
public class OptionalKeyWord {
    public static void main(String[] args) {
        Student student = new Student(1,null);
        if(student.getName() != null){
            System.out.println(student.getName().toLowerCase());
        }
        else System.out.println("Null");

//        Optional<String> optional = Optional.empty();
//        System.out.println(optional);
//
//        Optional<String> optional1 = Optional.of(student.getName());
//        System.out.println(optional1);

        Optional<String> optional2 = Optional.ofNullable(student.getName());
        System.out.println(optional2);
    }


}
class Student{
    int id ;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}