package Advanced.DefiningClasses.Exercise.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }

        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);
    }
}
