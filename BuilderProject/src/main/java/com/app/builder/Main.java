package com.app.builder;

import javax.jms.JMSException;

public class Main {


    public static void main(String[] args) throws JMSException {
        Person person = new Person.Builder("Max").setAge(12).setSername("kerch").build();
        person.publish();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getSername());
    }
}
