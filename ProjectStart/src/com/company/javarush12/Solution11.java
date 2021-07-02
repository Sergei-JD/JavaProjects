package com.company.javarush12;

//    Сделай класс Pet абстрактным.
//
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Класс Pet должен быть статическим.
//    •	Класс Pet должен быть абстрактным.
//    •	Класс Pet должен иметь один метод getName().
/*
Абстрактный класс Pet
*/

public class Solution11 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
    }

}
