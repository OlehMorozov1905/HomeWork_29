package HomeWork_29;

public abstract class Shape {
    protected double side;
    public Shape(double side) {
        this.side = side;
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();
}
