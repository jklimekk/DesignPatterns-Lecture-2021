package abstractFactory;

public class OracleStatement implements Statement {

    @Override
    public void execute() {
        System.out.println("oracle execute");
    }
}
