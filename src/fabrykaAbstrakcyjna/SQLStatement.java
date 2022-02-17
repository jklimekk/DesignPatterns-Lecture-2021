package fabrykaAbstrakcyjna;

public class SQLStatement implements Statement {

    @Override
    public void execute() {
        System.out.println("sql execute");
    }
}
