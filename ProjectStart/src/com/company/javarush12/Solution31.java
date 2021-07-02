package com.company.javarush12;

/*
Ненужные абстракции
*/

public class Solution31 {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public interface CanFly {
        void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }
}
