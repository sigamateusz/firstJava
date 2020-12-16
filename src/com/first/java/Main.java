package com.first.java;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("name");
        System.out.println(person.getName());
        person.setName("x");
        System.out.println(person.getName());
    }
}
