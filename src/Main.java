public class Main {
    public static void main(String[] args) {
        FileSystemHandler fsHandler = new FileSystemHandler();

        // Adding directories
        fsHandler.addDirectory("root", "docs");
        fsHandler.addDirectory("root/docs", "subdir1");

        // Creating files
        fsHandler.createFile("root/docs/subdir1", "file1.txt", 100, "text", "This is a text file.");

        // Listing files and directories
        fsHandler.listFilesAndDirectories("root/docs");

        // Searching files and directories
        fsHandler.searchFilesAndDirectories("root", "subdir");
    }
}
