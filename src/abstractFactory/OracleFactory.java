package abstractFactory;

public class OracleFactory extends AbstractFactory {

    @Override
    protected Connection connectionFactory() {
        return new OracleConnection();
    }

    @Override
    protected Statement statementFactory() {
        return new OracleStatement();
    }
}
