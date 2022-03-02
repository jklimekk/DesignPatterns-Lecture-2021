package abstractFactory;

public class SQLFactory extends AbstractFactory {

    @Override
    protected Connection connectionFactory() {
        return new SQLConnection();
    }

    @Override
    protected Statement statementFactory() {
        return new SQLStatement();
    }
}
