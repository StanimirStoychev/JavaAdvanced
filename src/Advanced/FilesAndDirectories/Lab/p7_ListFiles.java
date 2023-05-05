package Advanced.FilesAndDirectories.Lab;

import java.io.File;

public class p7_ListFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Stanimir\\Desktop\\SoftUni\\JavaAdvanced\\src" +
                "\\Advanced\\FilesAndDirectories\\Lab\\Resources\\Files-and-Streams");
        boolean isExisting = file.exists();
        boolean isDirectory = file.isDirectory();

        if (isExisting) {
            if (isDirectory) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
    }
}