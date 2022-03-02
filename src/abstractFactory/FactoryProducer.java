package abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String dbType) {
        if(dbType == null) {
            return null;
        }

        if(dbType.equals("SQL")) {
            return new SQLFactory();
        } else if(dbType.equals("Oracle")) {
            return new OracleFactory();
        }

        return null;
    }
}
