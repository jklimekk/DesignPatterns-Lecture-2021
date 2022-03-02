package decorator;

public class MultiplyDecorator extends OperationDecorator {
    private Number numberToMultiply;

    public MultiplyDecorator(Number number, Number numberToMultiply) {
        super(number);
        this.numberToMultiply = numberToMultiply;
    }

    @Override
    public double calculate() {
        return number.calculate() * numberToMultiply.calculate();
    }
}
