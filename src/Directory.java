import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;
    private List<Directory> subdirectories;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subdirectories = new ArrayList<>();
    }

    // Add file to the directory
    public void addFile(File file) {
        files.add(file);
    }

    // Add subdirectory to the directory
    public void addSubdirectory(Directory subdir) {
        subdirectories.add(subdir);
    }

    // List files in the directory
    public List<String> listFiles() {
        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            fileNames.add(file.getName());
        }
        return fileNames;
    }

    // List subdirectories in the directory
    public List<String> listSubdirectories() {
        List<String> subdirNames = new ArrayList<>();
        for (Directory subdir : subdirectories) {
            subdirNames.add(subdir.name);
        }
        return subdirNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Directory> getSubdirectories() {
        return subdirectories;
    }

    public void setSubdirectories(List<Directory> subdirectories) {
        this.subdirectories = subdirectories;
    }
}
