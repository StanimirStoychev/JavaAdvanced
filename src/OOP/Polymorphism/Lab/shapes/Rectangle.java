package OOP.Polymorphism.Lab.shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }
}
