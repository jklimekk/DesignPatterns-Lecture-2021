package prototyp;

public class AppMain {
    public static void main(String[] args) {
        ShapeCache.load();
        Shape s1 = ShapeCache.getShape("Circle");
        System.out.println(s1);
        Shape s2 = ShapeCache.getShape("Circle");
        System.out.println(s2);
    }
}
