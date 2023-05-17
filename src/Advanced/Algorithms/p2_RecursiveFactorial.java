import java.util.Scanner;

public class p2_RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n));
    }

    private static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
