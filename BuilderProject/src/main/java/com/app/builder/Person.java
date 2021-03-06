package com.app.builder;

import javax.jms.JMSException;

public class Person {

    private final String name;
    private final String sername;
    private final int age;
    private JMSClient jmsClient;

    private Person(Builder builder) {
        if (builder.name == null || "".equals(builder.name)) {
            throw new RuntimeException("Name should not be empty");
        }
        this.name = builder.name;
        this.sername = builder.sername;
        this.age = builder.age;
        jmsClient = new JMSClient();
    }

    public void publish() throws JMSException {
        jmsClient.publish(this);
    }


    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private String sername;
        private int age;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setSername(String sername) {
            this.sername = sername;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", age=" + age +
                ", jmsClient=" + jmsClient +
                '}';
    }
}
