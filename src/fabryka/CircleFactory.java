package fabryka;

public class CircleFactory extends Factory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}