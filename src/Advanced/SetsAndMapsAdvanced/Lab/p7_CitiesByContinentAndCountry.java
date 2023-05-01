package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class p7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        fillContinentsWithCountriesAndCities(scanner, continents);

        printOutput(continents);
    }

    private static void printOutput(Map<String, Map<String, List<String>>> continents) {
        for (var continent : continents.entrySet()) {
            System.out.println(continent.getKey() + ":");
            for (var country : continents.get(continent.getKey()).entrySet()) {
                System.out.print(country.getKey() + " -> ");
                for (int i = 0; i < country.getValue().size(); i++) {
                    if (i != country.getValue().size() - 1) {
                        System.out.printf("%s, ", country.getValue().get(i));
                    } else {
                        System.out.print(country.getValue().get(i));
                    }
                }
                System.out.println();
            }
        }
    }

    private static void fillContinentsWithCountriesAndCities(Scanner scanner, Map<String, Map<String, List<String>>> continents) {
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new ArrayList<>());
            continents.get(continent).get(country).add(city);
        }
    }
}
