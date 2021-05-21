package com.company.lesson09;

public class User {
    private int age;
    private String name;
    private String passportDate;

    public User(){
    }

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public User(int age, String name, String passportDate) {
        this.age = age;
        this.name = name;
        this.passportDate = passportDate;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void talk(String text) {
        System.out.println(text);
    }
    public static void m(){
    }
}
