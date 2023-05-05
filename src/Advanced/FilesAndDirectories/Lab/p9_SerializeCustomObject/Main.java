package Advanced.FilesAndDirectories.Lab.p9_SerializeCustomObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Stanimir\\Desktop\\SoftUni\\JavaAdvanced\\src" +
                "\\Advanced\\FilesAndDirectories\\Lab\\p9_SerializeCustomObject\\save.txt";

        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3d;
        cube.height = 12.4d;
        cube.depth = 3d;

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(path))) {
            oos.writeObject(cube);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
