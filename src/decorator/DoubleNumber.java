package decorator;

public class DoubleNumber implements Number {
    private double val;

    public DoubleNumber(double val) {
        this.val = val;
    }

    @Override
    public double calculate() {
        return this.val;
    }
}
