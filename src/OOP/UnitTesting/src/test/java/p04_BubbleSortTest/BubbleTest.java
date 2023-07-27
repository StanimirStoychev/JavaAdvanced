package p04_BubbleSortTest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleTest {

    int[] numbers;
    int[] sorted;

    @Before
    public void prepare() {
        numbers = new int[] {5, 4, 3, 2, 1};
        sorted = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    public void testBubbleSort() {
        Bubble.sort(numbers);
        Assert.assertArrayEquals(sorted, numbers);
    }

}