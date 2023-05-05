package Advanced.FilesAndDirectories.Lab;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class p8_NestedFolders {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Stanimir\\Desktop\\SoftUni\\JavaAdvanced\\src" +
                "\\Advanced\\FilesAndDirectories\\Lab\\Resources\\Files-and-Streams");

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(file);
        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            assert nestedFiles != null;
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()){
                    dirs.offer(nestedFile);
                    count++;
                    System.out.println(current.getName());
                }
            }
        }
        System.out.println(count + " folders");
    }
}
