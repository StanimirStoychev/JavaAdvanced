package RegularExam.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {

    private String type;
    private int exerciseCount;
    private List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return exercises.removeIf(exercise -> exercise.getName().equals(name) && exercise.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        return exercises.stream()
                .filter(exercise -> exercise.getName().equals(name) && exercise.getMuscle().equals(muscle))
                .findFirst().orElse(null);
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (!exercises.isEmpty()) {
            return exercises.stream()
                    .max(Comparator.comparingInt(Exercise::getBurnedCalories))
                    .get();
        }
        return null;
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s%n", this.type));

        for (Exercise exercise : exercises) {
            sb.append(String.format("%s%n", exercise.toString()));
        }
        return sb.toString().trim();
    }
}
