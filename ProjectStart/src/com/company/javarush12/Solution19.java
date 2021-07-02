package com.company.javarush12;

//    Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
//    Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет).
//
//    Требования:
//    Класс Solution должен содержать интерфейс CanFly с одним методом fly().
//    Класс Solution должен содержать интерфейс CanRun с одним методом run().
//    Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
//    Человек должен уметь бегать и плавать.
//    Утка должна уметь летать, плавать и бегать.
//    Пингвин должен уметь плавать и бегать.
//    Самолет должен уметь летать и ездить.
/*
Создаем человека
*/

public class Solution19 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim{
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements CanFly, CanSwim, CanRun {
        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Penguin implements CanSwim, CanRun{
        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Airplane implements CanFly, CanRun{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
