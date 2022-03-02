package prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> cache = new Hashtable<>();

    public static Shape getShape(String name){
        Shape shape = cache.get(name);
        return (Shape) shape.clone(); // returning clone of our object
    }

    public static void load(){
        Circle c = new Circle();
        cache.put(c.getName(), c);
        Square s = new Square();
        cache.put(s.getName(), s);
    }
}

