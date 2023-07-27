package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    ListIterator listIterator;

    @Before //setup
    public void testConstructorSuccessfully() throws OperationNotSupportedException {
        String[] words = new String[3];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        listIterator = new ListIterator(words);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorWithNullArgs() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void testMove() {
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertFalse(listIterator.move());
    }

    @Test
    public void testHasNext() {
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertFalse(listIterator.hasNext());
    }

    @Test
    public void testPrintSuccess() {
        assertEquals("one", listIterator.print());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintWithNullArgs() throws OperationNotSupportedException {
        String[] elements = new String[0];
        ListIterator test = new ListIterator(elements);
        test.print();
    }
}