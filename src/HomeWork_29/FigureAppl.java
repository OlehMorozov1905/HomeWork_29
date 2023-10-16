package HomeWork_29;
//Создайте абстрактный класс Shape с полем side типа double и
//        абстрактными методами calcArea и calcPerimeter.
//        Создайте классы Circle, Triangle, Square,
//        которые наследуют классу Shape и реализуют абстрактные методы.
//        Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
//        Добавьте в массив два круга, один треугольник и один квадрат.
//        Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
//        Вычислите общую площадь кругов. (*)
public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(23.0);
        shapes[1] = new Circle(34.0);
        shapes[2] = new Triangle(45.0);
        shapes[3] = new Square(27.0);

        double totalArea = 0;
        double totalPerimeter = 0;

        double totalCircleArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
            totalPerimeter += shape.calcPerimeter();

            if (shape instanceof Circle) {
                totalCircleArea += shape.calcArea();
            }
        }

        System.out.printf("Общая площадь всех фигур: %.2f", totalArea);
        System.out.println(" единиц^2");
        System.out.printf("Общий периметр всех фигур: %.2f", totalPerimeter);
        System.out.println(" единиц");
        System.out.printf("Общая площадь кругов: %.2f", totalCircleArea);
        System.out.println(" единиц^2");
    }
}
