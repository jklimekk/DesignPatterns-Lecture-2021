package composite;

public interface File {
    void runFile();

    void addChild(File child);

    void removeChild(File child);
}
