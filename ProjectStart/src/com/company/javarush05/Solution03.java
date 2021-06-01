package com.company.javarush05;

public class Solution03 {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 40, 20);
        Dog tommyDog = new Dog("Tommy", 65, 40);

        System.out.println(jerryMouse);
        System.out.println(tomCat);
        System.out.println(tommyDog);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
        public String toString() {
            return (name + " " + height + " " + tail);
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
        public String toString() {
            return (name + " " + height + " " + tail);
        }

    }
    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
        public String toString() {
            return (name + " " + height + " " + tail);
        }
    }
}
