package BuilderTest;

import com.app.builder.Person;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void testCorrect() {
        Person person = new Person.Builder("Max").setAge(12).setSername("Kerch").build();
        Assert.assertTrue(person.getName().equals("Max"));
        Assert.assertTrue(person.getSername().equals("Kerch"));
        Assert.assertTrue(person.getAge() == 12);
    }


    @Test(expected = java.lang.RuntimeException.class)
    public void testIncorrect() {
        Person person = new Person.Builder("").setAge(12).setSername("Kerch").build();
    }

    @Test
    public void testIncorrect2() {
        try {
            Person person = new Person.Builder("").setAge(12).setSername("Kerch").build();
        } catch (RuntimeException ex) {
            String message = ex.getMessage();
            Assert.assertTrue(message.equals("Name should not be empty"));
        }
    }
}
