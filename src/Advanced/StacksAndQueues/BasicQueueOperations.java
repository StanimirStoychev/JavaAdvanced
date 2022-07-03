package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int countToOffer = input[0];
        int countToPoll = input[1];
        int element = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countToOffer; i++) {
            stack.offer(numbers[i]);
        }

        for (int i = 0; i < countToPoll; i++) {
            stack.poll();
        }

        if (stack.contains(element)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(stack.stream().mapToInt(e -> e).min().getAsInt());
        }
    }
}
