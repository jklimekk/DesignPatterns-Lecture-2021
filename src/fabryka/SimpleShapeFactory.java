package fabryka;

// inna wersja - nie wzorcowa (nie trzeba tyle "new" w mainie)

public class SimpleShapeFactory {

    public static Shape factoryMethod(String shape) {
        if(shape == null)
            return null;
        switch(shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
