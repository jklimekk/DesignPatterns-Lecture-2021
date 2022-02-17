package fabrykaAbstrakcyjna;

public class SQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("sql connect");
    }
}
