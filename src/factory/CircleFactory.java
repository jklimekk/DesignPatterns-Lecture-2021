package factory;

public class CircleFactory extends Factory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}