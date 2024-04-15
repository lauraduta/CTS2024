package Adapter;

import java.util.ArrayList;
import java.util.List;

interface FileSystemItem {
    void printName();
}
public class File implements FileSystemItem {
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Name: " + name);
    }
}

class Directory implements FileSystemItem {
    private List<FileSystemItem> items = new ArrayList<>();
    private String name;
    public Directory(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : items) {
            item.printName();
        }
    }
    public void addItem(FileSystemItem item) {
        items.add(item);
    }
}

class MainA {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.docx");
        File file3 = new File("File3.pdf");

        Directory rootDirectory = new Directory("RootDirectory");

        rootDirectory.addItem(file1);
        rootDirectory.addItem(file2);

        Directory subDirectory = new Directory("SubDirectory");

        subDirectory.addItem(file3);
        rootDirectory.addItem(subDirectory);

        rootDirectory.printName();
    }
}

