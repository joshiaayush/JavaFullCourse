package polymorphism;

public class Main {

    public void display() {
        System.out.println("I am in display");
    }

    public void display(int i){
        System.out.println("Display "+i);
    }

    public void display(int i, int j){
        System.out.println("Display "+i+j);
    }

    public static void main(String[] args) throws Exception {
        Main obj = new Main();
        obj.display();
        obj.display(3,4);
        obj.display(5);
    }
}
