package composite;

public class ExecutableFile implements File {

    private String name;

    public ExecutableFile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void runFile() {
        System.out.println(this);
    }

    @Override
    public void addChild(File child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeChild(File child) {
        throw new UnsupportedOperationException();
    }
}
