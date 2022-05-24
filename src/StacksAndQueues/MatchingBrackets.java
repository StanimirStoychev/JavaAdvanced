package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
            stack.push(i);
            } else if (ch == ')') {
                int lastOpenIndex = stack.pop();
                String contents = expression.substring(lastOpenIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
