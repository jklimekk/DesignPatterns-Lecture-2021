package adapter;

public class MyAdapter implements Adapter {

    private final Adapteted adapteted;

    public MyAdapter(Adapteted adapteted) {
        this.adapteted = adapteted;
    }

    @Override
    public void newFoo() {
        this.adapteted.foo();
        System.out.println("new foo");
    }
}
