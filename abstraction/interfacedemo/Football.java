package abstraction.interfacedemo;

public class Football implements Sports, Sports1 {
    public void show(){
        System.out.println("In show");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.show();
        obj.exercise();
    }
    public void exercise(){
        System.out.println("In exercise");
    }
}
