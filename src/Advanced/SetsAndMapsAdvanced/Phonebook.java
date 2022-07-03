package Advanced.SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        String command;

        while (!"search".equals(command = scanner.nextLine())) {
            String[] info = command.split("-");
            phonebook.put(info[0], info[1]);
        }

        while (!"stop".equals(command = scanner.nextLine())) {
            if (phonebook.containsKey(command)) {
                System.out.printf("%s -> %s%n",command, phonebook.get(command));
            } else {
                System.out.printf("Contact %s does not exist.%n", command);
            }
        }
    }
}
