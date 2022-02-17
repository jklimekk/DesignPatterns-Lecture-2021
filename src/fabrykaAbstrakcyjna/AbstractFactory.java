package fabrykaAbstrakcyjna;

public abstract class AbstractFactory {
    protected abstract Connection connectionFactory();
    protected abstract Statement statementFactory();
}
