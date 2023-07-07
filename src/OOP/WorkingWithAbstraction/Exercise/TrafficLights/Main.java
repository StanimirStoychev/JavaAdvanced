package OOP.WorkingWithAbstraction.Exercise.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int count = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            TrafficLight trafficLight = TrafficLight.valueOf(color);
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < count; i++) {
            int currentCount = 0;
            for (TrafficLight trafficLight : trafficLights) {
                System.out.print(trafficLight.next() + " ");
                trafficLights.set(currentCount, trafficLight.next());
                currentCount++;

            }
            System.out.println();
        }
    }
}
