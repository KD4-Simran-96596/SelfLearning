abstract class Shape {
    abstract void calculate();
}

// 2D Shape
abstract class TwoDShape extends Shape {
    abstract double area();
}

// 3D Shape
abstract class ThreeDShape extends Shape {
    abstract double area();
    abstract double volume();
}
class Circle extends TwoDShape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void calculate() {
        System.out.println("Circle Area = " + area());
    }
}

class Rectangle extends TwoDShape {
    double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public void calculate() {
        System.out.println("Rectangle Area = " + area());
    }
}

class Sphere extends ThreeDShape {
    double radius;

    public Sphere(double r) {
        radius = r;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0/3) * Math.PI * radius * radius * radius;
    }

    public void calculate() {
        System.out.println("Sphere Area = " + area());
        System.out.println("Sphere Volume = " + volume());
    }
}

class Cube extends ThreeDShape {
    double side;

    public Cube(double s) {
        side = s;
    }

    public double area() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }

    public void calculate() {
        System.out.println("Cube Area = " + area());
        System.out.println("Cube Volume = " + volume());
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Sphere(3),
            new Cube(2)
        };

        for (Shape s : shapes) {
            s.calculate();
            System.out.println();
        }
    }
}
