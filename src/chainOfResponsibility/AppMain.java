package chainOfResponsibility;

public class AppMain {
    public static void main(String[] args) {
        Handler firsHandler = new Withdraw10();
        firsHandler.setNextHandler(new Withdraw5()); // here decision about order
        firsHandler.handle(new Money(27));
    }
}
