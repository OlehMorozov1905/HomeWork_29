package HomeWork_29;

public class Circle extends Shape{
    public Circle(double radius) {
        super(radius);
    }
    @Override
    public double calcArea() {
        return Math.PI * side * side;
    }
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * side;
    }
}
