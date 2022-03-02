package factory;

// another version - without "new" in main

public class SimpleShapeFactory {

    public static Shape factoryMethod(String shape) {
        if(shape == null)
            return null;
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
