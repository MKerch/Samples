package com.app.builder;

public class Main {


    public static void main(String[] args) {
        Person person = new Person.Builder("Max").setAge(12).setSername("kerch").build();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getSername());
    }
}
