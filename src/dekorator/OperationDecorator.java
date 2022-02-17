package dekorator;

public abstract class OperationDecorator implements Number {
    protected Number number;

    public OperationDecorator(Number number) {
        this.number = number;
    }

}
