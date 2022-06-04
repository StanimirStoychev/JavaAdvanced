package FilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/resources/input.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("src/resources/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}