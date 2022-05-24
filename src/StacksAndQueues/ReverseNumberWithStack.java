package StacksAndQueues;

import java.io.StringBufferInputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        ArrayDeque<String> reversedNumbers = new ArrayDeque<>();

        for (String number : numbers) {
            reversedNumbers.push(number);
        }
        while (!reversedNumbers.isEmpty()) {
            System.out.print(reversedNumbers.pop() + " ");
        }
    }
}
