abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class shape {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        String circleColor = circle.getColor();
        double circleArea = circle.calculateArea();
        System.out.println("Circle color: " + circleColor);
        System.out.println("Circle area: " + circleArea);
    }
}
