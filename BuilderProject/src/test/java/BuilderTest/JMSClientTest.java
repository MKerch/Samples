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
    private Connection connection;
    private String connectionURL;
    private String destinationName;


    @Before
    public void init() throws Exception {
        connectionURL = System.getProperty("host", "tcp://localhost:61616");
        destinationName = System.getProperty("queueName", "INBOUND");
        broker = new BrokerService();
        broker.addConnector(connectionURL);
        broker.setPersistent(true);
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
        System.out.println("before= " + countBefore);
        System.out.println("after= " + countAfter);
        Assert.assertTrue(countAfter - 1 == countBefore);
    }


    private int count() throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory();
        connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        QueueBrowser inbound = session.createBrowser(new ActiveMQQueue(System.getProperty("queueName", destinationName)));
        Enumeration enumeration = inbound.getEnumeration();
        int count = 0;
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
            count++;
        }
        return count;
    }

    @After
    public void after() throws Exception {
        connection.close();
        broker.stop();
    }
}
