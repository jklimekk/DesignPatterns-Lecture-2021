package kompozyt;

public class KompozytMain {
    public static void main(String[] args) {
        File root = new Directory("root");
        File dir1 = new Directory("dir1");

        File file1 = new ExecutableFile("file1");
        File file2 = new ExecutableFile("file2");
        File file3 = new ExecutableFile("file3");

        root.addChild(dir1);
        root.addChild(file1);
        dir1.addChild(file2);
        dir1.addChild(file3);

        root.runFile();
    }
}
