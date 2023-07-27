package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    Database database;
    Integer[] numbers = {1, 2, 3, 4};

    @Before
    public void setup() throws OperationNotSupportedException {
        database = new Database(numbers);
    }

    @Test
    public void testConstructorSuccess() {
        Assert.assertArrayEquals(numbers, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithMoreThantSixteenArguments() throws OperationNotSupportedException {
        Integer[] test = new Integer[17];
        database = new Database(test);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithEmptyArguments() throws OperationNotSupportedException {
        Integer[] test = new Integer[0];
        database = new Database(test);
    }

    @Test
    public void testAddSuccess() throws OperationNotSupportedException {
        database.add(5);
        Assert.assertEquals(numbers.length + 1, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddWithNull() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveSuccess() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(numbers.length - 1, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveFromEmptyDB() throws OperationNotSupportedException {
        for (int i = 0; i <= numbers.length; i++) {
            database.remove();
        }
    }
}