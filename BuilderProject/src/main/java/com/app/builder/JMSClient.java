package com.app.builder;


import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


public class JMSClient {

    private ActiveMQConnectionFactory connectionFactory;

    public void publish(Person person) throws JMSException {
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("INBOUND");
        MessageProducer messageProducer = session.createProducer(queue);
        TextMessage textMessage = session.createTextMessage(person.toString());
        messageProducer.send(textMessage);
    }
}
