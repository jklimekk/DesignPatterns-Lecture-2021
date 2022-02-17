package fabrykaAbstrakcyjna;

public class OracleConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("oracle connect");
    }
}
