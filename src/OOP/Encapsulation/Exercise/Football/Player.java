package OOP.Encapsulation.Exercise.Football;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public String getName() {
        return name;
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

    private static void printMessageForWrongInput(String statName) {
        System.out.printf("%s should be between 0 and 100.%n", statName);
    }

    private static boolean invalidRange(int endurance) {
        return endurance < 0 || endurance > 100;
    }

    private void setEndurance(int endurance) {

        if (invalidRange(endurance)) {
            printMessageForWrongInput("Endurance");
        } else {
            this.endurance = endurance;
        }
    }

    private void setSprint(int sprint) {
        if (invalidRange(sprint)) {
            printMessageForWrongInput("Sprint");
        } else {
            this.sprint = sprint;
        }
    }

    private void setDribble(int dribble) {
        if (invalidRange(dribble)) {
            printMessageForWrongInput("Dribble");
        } else {
            this.dribble = dribble;
        }
    }

    private void setPassing(int passing) {
        if (invalidRange(passing)) {
            printMessageForWrongInput("Passing");
        } else {
            this.passing = passing;
        }
    }

    private void setShooting(int shooting) {
        if (invalidRange(shooting)) {
            printMessageForWrongInput("Shooting");
        } else {
            this.shooting = shooting;
        }
    }

    public double overallSkillLevel() {
        return (double) (endurance + sprint + dribble + passing + shooting) / 5;
    }
}
