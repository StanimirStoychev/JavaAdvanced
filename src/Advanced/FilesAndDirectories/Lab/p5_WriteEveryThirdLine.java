package Advanced.FilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class p5_WriteEveryThirdLine {
    public static void main(String[] args) {

        String inputPath = "Lab/Resources/input.txt";
        String outputPath = "Lab/Output/05.WriteEveryThirdLineOutput.txt";

        try (BufferedReader in =
                new BufferedReader(new FileReader(inputPath));
            PrintWriter out =
                new PrintWriter(new FileWriter(outputPath))) {
                int counter = 1;
                String line = in.readLine();
                while (line != null) {
                    if (counter % 3 == 0) {
                        out.println(line);
                    }
                    counter++;
                    line = in.readLine();
                }
        }
        catch (IOException ignored) {
            System.out.println("Input or output exception!");
        }
    }
}
