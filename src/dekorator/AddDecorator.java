package dekorator;

public class AddDecorator extends OperationDecorator {
    private Number numberToAdd;

    public AddDecorator(Number number, Number numberToAdd) {
        super(number);
        this.numberToAdd = numberToAdd;
    }

    @Override
    public double calculate() {
        return number.calculate() + numberToAdd.calculate();
    }
}
