package fabryka;

public class RectangleFactory extends Factory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
