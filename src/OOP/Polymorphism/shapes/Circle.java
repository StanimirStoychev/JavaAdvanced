package OOP.Polymorphism.shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    double calculatePerimeter() {
       return 2 * Math.PI * radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
