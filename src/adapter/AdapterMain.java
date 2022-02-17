package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Adapteted old = new Adapteted();
        Adapter adapter = new MyAdapter(old);

        adapter.newFoo();
    }
}
