package BuilderTest;

import com.app.builder.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        Person person = new Person.Builder("Max").setAge(12).setSername("Kerch").build();
        Assert.assertTrue(person.getName().equals("Max"));
        Assert.assertTrue(person.getSername().equals("Kerch"));
        Assert.assertTrue(person.getAge() == 12);
    }
}
