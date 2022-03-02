package factory;

public class Main {
    public static void main(String[] args) {
        Shape circle = new CircleFactory().factoryMethod();
        Shape rectangle = new RectangleFactory().factoryMethod();

        circle.draw();
        rectangle.draw();

        Shape circle2 = SimpleShapeFactory.factoryMethod("CIRCLE");
        Shape rectangle2 = SimpleShapeFactory.factoryMethod("RECTANGLE");

        circle2.draw();
        rectangle2.draw();

    }
}
