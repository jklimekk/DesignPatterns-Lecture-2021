package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {

    private String name;
    private List<File> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void runFile() {
        System.out.println(this);
        System.out.println("{");
        for(File f : files){
            f.runFile();
        }

        System.out.println("}");
    }

    @Override
    public void addChild(File child) {
        this.files.add(child);
    }

    @Override
    public void removeChild(File child) {
        this.files.remove(child);
    }
}
