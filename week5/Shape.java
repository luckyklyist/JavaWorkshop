class Shapee {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}

class Circle extends Shapee {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
