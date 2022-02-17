package dekorator;

public class SubstractDecorator extends OperationDecorator {
    private Number numberToSubstract;

    public SubstractDecorator(Number number, Number numberToSubstract) {
        super(number);
        this.numberToSubstract = numberToSubstract;
    }

    @Override
    public double calculate() {
        return number.calculate() - numberToSubstract.calculate();
    }
}
