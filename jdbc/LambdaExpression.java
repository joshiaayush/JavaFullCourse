package jdbc;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);

        list.forEach(System.out::println);

        MyInterface myInterface = () ->{
            System.out.println("Hello");
        };
        myInterface.msg();


    }
}
@FunctionalInterface
interface MyInterface{
    void msg();
}

