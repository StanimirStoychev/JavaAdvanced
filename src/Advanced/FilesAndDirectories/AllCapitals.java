package Advanced.FilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Advanced.resources/input.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("src/Advanced.resources/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}