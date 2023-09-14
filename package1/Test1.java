package package1;

public class Test1 {
    protected int i = 10;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}
/*
public - You can access variables / functions Throughout the project
private - You can access variables / functions only in the same class
default - You can access variables / functions within package only
protected - You can access variables / functions within package and outside the package by creating object
 */
