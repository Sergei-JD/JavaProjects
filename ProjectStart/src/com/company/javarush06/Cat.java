package com.company.javarush06;

//вероятность вызова метода finalize

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0 ; i < 1000000; i++) {

            Cat cat = new Cat();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект Cat уничтожен!");
    }
}
