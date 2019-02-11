package BuilderTest;

import com.app.builder.Person;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import javax.jms.*;
import java.util.Enumeration;

public class JMSClientTest {

    private BrokerService broker;

    @Before
    public void init() throws Exception {
        broker = new BrokerService();
        //broker.setPersistent(false);
        broker.start();
        Thread.sleep(3000);
    }

    @Test
    public void test() throws Exception {
        int countBefore = count();
        Person person = new Person.Builder("Max").setAge(12).setSername("kerch").build();
        person.publish();
        Thread.sleep(3000);
        int countAfter = count();
        Assert.assertTrue(countAfter-1==countBefore);
    }

    @After
    public void after() throws Exception {
        broker.stop();
    }

    private int count() throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory();
        Connection connection = factory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        QueueBrowser inbound = session.createBrowser(new ActiveMQQueue("INBOUND"));
        Enumeration enumeration = inbound.getEnumeration();
        int count=0;
        while (enumeration.hasMoreElements()){
            Object o = enumeration.nextElement();
            System.out.println(o);
            count++;
        }
        return count;
    }
}
