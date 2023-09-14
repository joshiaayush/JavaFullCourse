package inheritance;
class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constraint");
        radius =r;
    }
    public void area(){
        System.out.println(Math.PI*radius*radius);
//        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(int r , int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Problem_1 {
    public static void main(String[] args) {
    Circle obj = new Circle(12);
//    Cylinder obj1 = new Cylinder(12,2);
        System.out.println();
        obj.area();
    }
}
