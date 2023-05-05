package Advanced.FilesAndDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p6_SortLines {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Stanimir\\Desktop\\SoftUni\\JavaAdvanced\\src" +
                "\\Advanced\\FilesAndDirectories\\Lab\\Resources\\input.txt");
        Path output = Paths.get("C:\\Users\\Stanimir\\Desktop\\SoftUni\\JavaAdvanced\\src" +
                "\\Advanced\\FilesAndDirectories\\Lab\\Output\\06.SortLinesOutput.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream()
                    .filter(one -> !one.isBlank())
                    .collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
