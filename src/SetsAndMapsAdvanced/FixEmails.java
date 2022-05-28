package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        Map<String, String> emails = new LinkedHashMap<>();

        while (!"stop".equals(name = scanner.nextLine())) {
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emails.put(name, email);
            }
        }
        for (var email : emails.entrySet()) {
            System.out.printf("%s -> %s%n", email.getKey(), email.getValue());
        }
    }
}
