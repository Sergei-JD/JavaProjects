package com.company.javarush12;

//    Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
//    Добавить в каждый интерфейс по одному методу.
//
//    Требования:
//    Класс Solution должен содержать интерфейс CanFly.
//    Класс Solution должен содержать интерфейс CanRun.
//    Класс Solution должен содержать интерфейс CanSwim.
//    Интерфейс CanFly должен содержать один метод.
//    Интерфейс CanRun должен содержать один метод.
//    Интерфейс CanSwim должен содержать один метод.
/*
Лететь, бежать и плыть
*/

public class Solution17 {
    public static void main(String[] args) {

    }

    public interface CanFly{
        void fly();
    }

    public interface CanRun{
        void run();
    }

    public interface CanSwim{
        void swim();
    }

}
