package Advanced.FilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class p4_ExtractIntegers {
    public static void main(String[] args) {

        String inputPath = "Lab/Resources/input.txt";
        String outputPath = "Lab/Output/04.ExtractIntegersOutput.txt";

        try {
            Scanner scanner = new Scanner(new FileInputStream(inputPath));

            PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));


            while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        out.println(scanner.nextInt());
                    }
                scanner.next();
            }
            out.close();


            } catch (IOException ignored) {
            System.out.println("Input or output exception!");
        }
    }
}
