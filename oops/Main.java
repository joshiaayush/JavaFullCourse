package practice.oops;
// Abstract class
abstract class Shape {
    // Abstract method
    public abstract double area();
}

// Concrete class that extends Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete class that extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double area() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        Shape rectangle = new Rectangle(6, 10);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}