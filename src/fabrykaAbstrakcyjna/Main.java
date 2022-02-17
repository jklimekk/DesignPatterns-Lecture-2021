package fabrykaAbstrakcyjna;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("SQL");
        //AbstractFactory factory = FactoryProducer.getFactory("Oracle");
        Connection connection = factory.connectionFactory();
        Statement statement = factory.statementFactory();

        connection.connect();
        statement.execute();
    }
}
