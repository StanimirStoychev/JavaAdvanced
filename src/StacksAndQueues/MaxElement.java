package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] commands = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
            switch (commands[0]) {
                case 1:
                    stack.push(commands[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.stream().mapToInt(e -> e).max().getAsInt());
                    break;
            }
        }
    }
}
