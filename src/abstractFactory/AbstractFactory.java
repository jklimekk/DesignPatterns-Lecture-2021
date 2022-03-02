package abstractFactory;

public abstract class AbstractFactory {
    protected abstract Connection connectionFactory();
    protected abstract Statement statementFactory();
}
