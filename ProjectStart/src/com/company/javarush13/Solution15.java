package com.company.javarush13;

//    Создай классы Dog, Cat и Mouse.
//    Реализуй интерфейсы в добавленных классах, учитывая что:
//
//    Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
//    Мышь (Mouse) может передвигаться, и ее могут съесть;
//    Собака (Dog) может передвигаться и съесть кого-то.
//    Требования:
//    Класс Cat должен быть объявлен внутри класса Solution.
//    Класс Dog должен быть объявлен внутри класса Solution.
//    Класс Mouse должен быть объявлен внутри класса Solution.
//    Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
//    Мышь (Mouse) может передвигаться и может быть съедена.
//    Собака (Dog) может передвигаться и съесть кого-то.
/*
Том, Джерри и Спайк
*/

public class Solution15 {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Cat implements Movable,Edible, Eat{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    class Mouse implements Movable, Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    class Dog implements Movable, Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
}
