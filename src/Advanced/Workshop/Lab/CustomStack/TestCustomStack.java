package Lab.CustomStack;

public class TestCustomStack {
    public static void main(String[] args) {

        CustomStack customStack = new CustomStack();

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.push(6);

        System.out.println("Show stack after pushed elements:");
        showAllElements(customStack);
        System.out.println();

        System.out.println("Test method getSize():");
        System.out.println("Size: " + customStack.getSize());
        System.out.println();

        System.out.println("Test pop() method:");
        System.out.println(customStack.pop());
        System.out.println("Show all elements after pop():");
        showAllElements(customStack);
        System.out.println();

        System.out.println("Test peek() method:");
        System.out.println(customStack.peek());
    }

    private static void showAllElements(CustomStack customStack) {
        customStack.forEach(System.out::println);
    }
}
