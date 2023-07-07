package OOP.Encapsulation.Lab.person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            try {
                Person person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                people.add(person);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        Team team = new Team("Black Eagles");
        for (Person person : people) {
            team.addPlayer(person);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());
    }
}