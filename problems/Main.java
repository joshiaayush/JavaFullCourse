package practice.problems;


class Dog implements Animal {

    public void makeNoise(){
        System.out.println("Bark.....");
    }
}

class Cat implements Animal {

    public void makeNoise(){
        System.out.println("Meow");
    }
}

public class Main{
    public static void getNoise(Animal animal){
        animal.makeNoise();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj.getNoise(obj1);
        obj.getNoise(obj2);

    }
}


