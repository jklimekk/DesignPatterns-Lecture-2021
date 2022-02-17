package dekorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Number result = new AddDecorator(
                new DoubleNumber(5),
                new MultiplyDecorator(
                        new DoubleNumber(3),
                        new SubstractDecorator(
                                new DoubleNumber(11),
                                new DoubleNumber(2)
                        )
                )
        );

        System.out.println(result.calculate());
    }
}
