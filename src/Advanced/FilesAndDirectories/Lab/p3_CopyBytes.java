package Advanced.FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p3_CopyBytes {
    public static void main(String[] args) {

        String inputPath = "Lab/Resources/input.txt";
        String outputPath = "Lab/Output/03.CopyBytesOutput.txt";

        try (FileInputStream inputStream = new FileInputStream(inputPath)){

            FileOutputStream outputStream = new FileOutputStream(outputPath);

            int read = inputStream.read();

            while (read != -1) {
                if (read == 10 || read == 32) {
                    outputStream.write(read);
                } else {
                    String digits = String.valueOf(read);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
                    read = inputStream.read();
            }
        } catch (IOException ignored) {
            System.out.println("Input or output exception!");
        }
    }
}
