package p05_CustomLinkedList;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    CustomLinkedList<Integer> customLinkedList;
    List<Integer> linkedList = new LinkedList<>();


    @Before
    public void setup() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        linkedList = List.of(1, 2, 3);
    }

    @Test
    public void testGetSuccess() {
        int number = customLinkedList.get(2);
        assertEquals(3, number);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWithIndexMoreThanCount() {
        customLinkedList.get(4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetWithIndexLessThanZero() {
        customLinkedList.get(-1);
    }

    @Test
    public void testSetSuccess() {
        customLinkedList.set(2, 4);
        int expectedNum = customLinkedList.get(2);
        assertEquals(4, expectedNum);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetWithIndexMoreThanCount() {
        customLinkedList.set(4, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetWithIndexLessThanZero() {
        customLinkedList.set(-1, 2);
    }

    @Test
    public void testRemoveAtSuccess() {
        int currentLast = customLinkedList.get(2);
        assertEquals(3, currentLast);
        customLinkedList.removeAt(1);
        int last = customLinkedList.get(1);
        assertEquals(3, last);
    }

    @Test  (expected = IllegalArgumentException.class)
    public void testRemoveAtWithWrongIndex() {
        customLinkedList.removeAt(5);
    }

    @Test
    public void testRemoveSuccess() {
        int index1 = customLinkedList.get(1);
        assertEquals(2, index1);
        customLinkedList.remove(2);
        int currentIndex1 = customLinkedList.get(1);
        assertEquals(3, currentIndex1);
    }

    @Test
    public void testRemoveWithNotExistingElement() {
        int result = customLinkedList.remove(5);
        assertEquals(-1, result);
    }

    @Test
    public void testRemoveAllElements() {
        customLinkedList.remove(3);
        customLinkedList.remove(2);
        customLinkedList.remove(1);
    }

    @Test
    public void testIndexOfSuccess() {
        int index = customLinkedList.indexOf(3);
        assertEquals(2, index);
    }

    @Test
    public void testIndexOfWithNotExistingElement() {
        int result = customLinkedList.indexOf(5);
        assertEquals(-1, result);
    }

    @Test
    public void testContains() {
        assertTrue(customLinkedList.contains(3));
        assertFalse(customLinkedList.contains(5));
    }
}