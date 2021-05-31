package com.company.javarush05;

public class Solution01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.initialize("vanya", 20);
    }

    static class Person {
        String name;
        int age;

        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
