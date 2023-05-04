package Advanced.FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class p2_WriteToFile {
    public static void main(String[] args) {

        String inputPath = "Lab/Resources/input.txt";
        String outputPath = "Lab/Output/02.WriteToFileOutput.txt";

        try {
            FileInputStream inputStream = new FileInputStream(inputPath);
            FileOutputStream outputStream = new FileOutputStream(outputPath);

            int read = inputStream.read();

            Set<Character> punctuation = Set.of(',', '.', '!', '?');

            while (read != -1) {
                if (!punctuation.contains((char) read)) {
                    outputStream.write(read);
                }
                read = inputStream.read();
            }
        } catch (IOException ignored) {
            System.out.println("Input or output exception!");
        }
    }
}
