package Lab.CustomStack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {

    private final static int INITIAL_CAPACITY = 4;

    private int capacity;
    private int size;
    private int[] items;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if (this.size == this.capacity){
            this.resize();
        }

        this.items[this.size++] = element;
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];

        System.arraycopy(this.items, 0, copy, 0, this.items.length);

        this.items = copy;
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("Lab.CustomStack is empty");
        }
    }

    public int pop() {
        checkEmpty();

        int element = this.items[this.size - 1];
        this.size--;
        return element;
    }

    public int peek() {
        checkEmpty();

        return this.items[this.size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }
}
