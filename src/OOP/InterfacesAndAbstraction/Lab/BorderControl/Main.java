package OOP.InterfacesAndAbstraction.Lab.BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;

        List<Identifiable> people = new ArrayList<>();
        Identifiable creating = null;

        while (!"End".equals(command = scanner.nextLine())) {

            String[] tokens = command.split("\\s+");

            if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];
                creating = new Robot(model, id);
            } else if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                creating = new Citizen(name, age, id);
            }
            people.add(creating);
        }

        String findId = scanner.nextLine();

        people.stream().
        filter(e -> e.getId().endsWith(findId)).forEach(e -> System.out.println(e.getId()));
    }
}
