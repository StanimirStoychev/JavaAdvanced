package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ExtendedDatabaseTest {

    Database database;
    Person[] people;

    @Before
    public void prepare() throws OperationNotSupportedException {

        Person person = new Person(1, "Pesho");
        Person person2 = new Person(2, "Gosho");
        Person person3 = new Person(3, "Toshko");

        people = new Person[3];
        people[0] = person;
        people[1] = person2;
        people[2] = person3;

        database = new Database(people);
    }

    @Test
    public void testDBConstructorSuccess() throws OperationNotSupportedException {
        database = new Database(people);
        assertEquals(people.length, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDBWithNullArguments() throws OperationNotSupportedException {
        new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDBWithEmptyArguments() throws OperationNotSupportedException {
        new Database(new Person[0]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDBWithMoreThanSixteenArguments() throws OperationNotSupportedException {
        new Database(new Person[17]);
    }

    @Test
    public void testAddSuccess() throws OperationNotSupportedException {
        database.add(new Person(5, "Andrei"));
        assertEquals(people.length + 1, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddWithNullArgs() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveSuccess() throws OperationNotSupportedException {
        database.remove();
        assertEquals(people.length - 1, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveFromEmptyDB() throws OperationNotSupportedException {
        Database test = new Database(new Person(1, "Hari"));
        test.remove();
        test.remove();
    }

    @Test
    public void testGetElements() {
        assertArrayEquals(people, database.getElements());
    }

    @Test
    public void testFindByUsernameSuccess() throws OperationNotSupportedException {
        String username = database.findByUsername("Pesho").getUsername();
        int id = database.findByUsername("Pesho").getId();
        assertEquals(1, id);
        assertEquals("Pesho", username);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameWithNullArgs() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameWithNameWhoIsNotInTheDB() throws OperationNotSupportedException {
        database.findByUsername("Andrei");
    }

    @Test
    public void testFindByIdSuccess() throws OperationNotSupportedException {
        String username = database.findById(2).getUsername();
        int id = database.findById(2).getId();
        assertEquals(2, id);
        assertEquals("Gosho", username);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdWithNullArgs() throws OperationNotSupportedException {
        database.findById(100);
    }
}