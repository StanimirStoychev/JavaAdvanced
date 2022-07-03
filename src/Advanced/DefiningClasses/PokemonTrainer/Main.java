package Advanced.DefiningClasses.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String command;
        while (!"Tournament".equals(command = scanner.nextLine())) {
            String[] info = command.split("\\s+");
            String trainerName = info[0];
            String pokemonName = info[1];
            String element = info[2];
            int health = Integer.parseInt(info[3]);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            trainers.putIfAbsent(trainerName, new Trainer(trainerName, new ArrayList<>()));
            trainers.get(trainerName).getPokemonList().add(pokemon);
        }

        String element;
        while (!"End".equals(element = scanner.nextLine())) {
            for (var entry : trainers.entrySet()) {
                if (!entry.getValue().getPokemonList().isEmpty() && entry.getValue().hasElement(element)) {
                    entry.getValue().receiveBadge();
                } else {
                    entry.getValue().takeDamage();
                }
            }
        }
        Map<String, Trainer> sorted = new LinkedHashMap<>();
        trainers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((Comparator.comparingInt(Trainer::getBadges)).reversed()))
                .forEach(e -> sorted.put(e.getKey(), e.getValue()));
        if (!sorted.isEmpty()) {
            sorted.forEach((key, value) -> System.out.printf("%s %d %d%n", key, value.getBadges(), value.getNumberOfPokemons()));
        }
    }
}