package labsession240425;

abstract class Shape {
    public abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class ShapeAbs {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);          // radius = 5
        Shape rectangle = new Rectangle(4.0, 6.0); // length = 4, width = 6

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}