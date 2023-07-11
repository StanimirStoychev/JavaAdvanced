package OOP.Encapsulation.Exercise.Football;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String input;

        while (!"END".equals(input = scanner.nextLine())) {

            String[] data = input.split(";");
            String command = data[0];

            switch (command) {
                case "Team" -> {
                    String teamName = data[1];
                    var team = new Team(teamName);
                    teams.putIfAbsent(teamName, team);
                }
                case "Add" -> {
                    String playerName = data[2];
                    int endurance = Integer.parseInt(data[3]);
                    int sprint = Integer.parseInt(data[4]);
                    int dribble = Integer.parseInt(data[5]);
                    int passing = Integer.parseInt(data[6]);
                    int shooting = Integer.parseInt(data[7]);
                    var player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

                    if (areAllStatsInRange(endurance, sprint, dribble, passing, shooting)) {

                        if (teams.containsKey(data[1])) {
                            teams.get(data[1]).addPlayer(player);
                        } else {
                            System.out.printf("Team %s does not exist.%n", data[1]);
                        }
                    }
                }
                case "Remove" -> teams.get(data[1]).removePlayer(data[2]);
                case "Rating" -> System.out.println(data[1] + " - " + Math.round(teams.get(data[1]).getRating()));
            }
        }
    }

    private static boolean areAllStatsInRange(int endurance, int sprint, int dribble, int passing, int shooting) {
        return validRange(endurance) && validRange(sprint) && validRange(dribble) &&
                validRange(passing) && validRange(shooting);
    }

    private static boolean validRange(int stat) {
        return stat >= 0 && stat <= 100;
    }
}
