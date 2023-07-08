package OOP.Encapsulation.Exercise.Football;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {

        if (nameIsEmpty(name)) {
            System.out.println("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    private static boolean nameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        boolean havePlayer = false;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(name)) {
                players.remove(players.get(i));
                havePlayer = true;
            }
        }

        if (!havePlayer) {
            System.out.printf("Player %s is not in %s team.%n", name, getName());
        }
    }

    public double getRating() {

        double sum = 0;

        for (Player player : players) {
            sum += player.overallSkillLevel();
        }

        return sum / players.size();
    }
}
