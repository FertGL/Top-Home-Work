package Servers.Paterns.Composite;

import java.util.ArrayList;
import java.util.List;

interface FileComponent {
    void showDetails();
}

class File implements FileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Файл: " + name);
    }
}

class Directory implements FileComponent {
    private String name;
    private List<FileComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Каталог: " + name);
        for (FileComponent component : children) {
            component.showDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new File("file1.txt");
        FileComponent file2 = new File("file2.txt");
        FileComponent file3 = new File("file3.doc");

        Directory directory1 = new Directory("Documents");
        directory1.add(file1);
        directory1.add(file2);

        Directory directory2 = new Directory("MyProjects");
        directory2.add(file3);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);

        rootDirectory.showDetails();
    }
}
