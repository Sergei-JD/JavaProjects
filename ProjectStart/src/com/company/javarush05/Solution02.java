package com.company.javarush05;

public class Solution02 {
    public static void main(String[] args) {
        Man man1 = new Man("Jonh", 20, "address man 1");
        Man man2 = new Man("Tim", 22, "address man 2");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Klava", 19, "address woman 1");
        Woman woman2 = new Woman("Jessica", 20, "address woman 2");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}
