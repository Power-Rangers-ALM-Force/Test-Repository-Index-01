import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getName() {
        Person person = new Person("Ali",2,3);
        assertEquals("Ali", person.getName());
    }

    @Test
    public void getAge() {
        Person person = new Person("Ali",2,3);
        assertEquals(2, person.getAge());
    }

    @Test
    public void getHeight() {
        Person person = new Person("Ali",2,3);
        assertEquals(3, person.getHeight());
    }
}
