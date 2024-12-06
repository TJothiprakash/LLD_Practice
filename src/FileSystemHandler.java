import java.util.logging.Logger;

public class FileSystemHandler {
    Directory root;
    private Logger logger = Logger.getLogger(FileSystemHandler.class.getName());

    public FileSystemHandler() {
        root = new Directory("root");
        logger.info("File system initialized with root directory.");
    }

    // Add directory to the system
    public void addDirectory(String path, String name) {
        logger.info("Adding directory " + name + " to " + path);
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                if (dir.getSubdirectories().stream().anyMatch(subdir -> subdir.getName().equals(name))) {
                    logger.warning("Directory " + name + " already exists in " + path);
                } else {
                    dir.addSubdirectory(new Directory(name));
                    logger.info("Directory " + name + " added to " + path);
                }
            } else {
                logger.warning("Path " + path + " not found. Could not add directory.");
            }
        } catch (Exception e) {
            logger.warning("An error occurred while adding the directory: " + e.getMessage());
        }
    }

    // Create a new file and add it to the directory
    public void createFile(String path, String name, int size, String type, String content) {
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                logger.info("Adding file " + name + " to " + path);
                dir.addFile(new File(name, size, type, content));
                logger.info("File " + name + " added to " + path);
            }
        } catch (Exception e) {
            logger.warning("An error occurred while adding the file: " + e.getMessage());
        }
    }

    // Find directory by path
    private Directory findDirectory(String path) {
        try {
            Directory currentDir = root;  // Start from the root directory
            String[] dirs = path.split("/");  // Split the path by "/"
            logger.info("Finding directory " + path);

            // Iterate over each directory in the path
            for (String dirName : dirs) {
                boolean found = false;

                // Check if the current directory has subdirectories
                if (currentDir.getSubdirectories().size() > 0) {
                    // Search for the subdirectory with the matching name
                    for (Directory subdir : currentDir.getSubdirectories()) {
                        if (subdir.getName().equals(dirName)) {
                            currentDir = subdir;  // Directory found, move into it
                            found = true;
                            break;
                        }
                    }
                }

                // If directory is not found, create it
                if (!found) {
                    Directory newDir = new Directory(dirName);
                    currentDir.addSubdirectory(newDir);  // Add it to the current directory
                    currentDir = newDir;  // Move to the newly created directory
                    logger.info("Created new directory " + dirName + " under " + currentDir.getName());
                }
            }

            logger.info("Directory " + path + " found or created");
            return currentDir;  // Return the found or created directory
        } catch (Exception e) {
            logger.warning("An error occurred while finding directory " + path + ": " + e.getMessage());
            return null;
        }
    }

    // Remove file from a directory
    public void removeFile(String path, String fileName) {
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                logger.info("Removing file " + fileName + " from " + path);
                dir.getFiles().removeIf(file -> file.getName().equals(fileName));
                logger.info("File " + fileName + " removed from " + path);
            }
        } catch (Exception e) {
            logger.warning("An error occurred while removing the file: " + e.getMessage());
        }
    }

    // Remove directory
    public void removeDirectory(String path, String dirName) {
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                logger.info("Removing directory " + dirName + " from " + path);
                dir.getSubdirectories().removeIf(subdir -> subdir.getName().equals(dirName));
                logger.info("Directory " + dirName + " removed from " + path);
            }
        } catch (Exception e) {
            logger.warning("An error occurred while removing the directory: " + e.getMessage());
        }
    }

    // List all files and directories in a directory
    public void listFilesAndDirectories(String path) {
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                System.out.println("Files in " + path + ":");
                dir.listFiles().forEach(file -> System.out.println(file));
                System.out.println("Directories in " + path + ":");
                dir.listSubdirectories().forEach(subdir -> System.out.println(subdir));
            }
        } catch (Exception e) {
            logger.warning("An error occurred while listing files and directories: " + e.getMessage());
        }
    }

    // Search for files and directories containing a specific keyword
    public void searchFilesAndDirectories(String path, String keyword) {
        try {
            Directory dir = findDirectory(path);
            if (dir != null) {
                System.out.println("Files in " + path + " containing " + keyword + ":");
                dir.listFiles().forEach(file -> {
                    if (file.contains(keyword)) {
                        System.out.println(file);
                    }
                });
                System.out.println("Directories in " + path + " containing " + keyword + ":");
                dir.listSubdirectories().forEach(subdir -> {
                    if (subdir.contains(keyword)) {
                        System.out.println(subdir);
                    }
                });
            }
        } catch (Exception e) {
            logger.warning("An error occurred while searching: " + e.getMessage());
        }
    }
}
