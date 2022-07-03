package Advanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liliesQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(liliesQueue::push);
        ArrayDeque<Integer> rosesStack = Arrays.stream(scanner.nextLine().split(", "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(ArrayDeque::new));

        int wreaths = 0;
        int remainingFlowers = 0;

        while (!rosesStack.isEmpty() && !liliesQueue.isEmpty()) {
            int currentRoses = liliesQueue.poll();
            int currentLilies = rosesStack.pop();
            int sum = currentRoses + currentLilies;

            while (sum > 15) {
                sum -= 2;
            }
            if (sum == 15) {
                wreaths++;
            } else {
                remainingFlowers += sum;
            }
        }
        if (remainingFlowers > 14) {
            int sumOfAdditionalWreaths = remainingFlowers / 15;
            wreaths += sumOfAdditionalWreaths;
        }

        if (wreaths > 4) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }
    }
}
