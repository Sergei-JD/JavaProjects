package com.company.javarush13;

//    Реализуй в классе Fox интерфейс Animal.
//    Поменяй код так, чтобы в классе Fox был только один метод - getName.
//    Учти, что создавать дополнительные классы и удалять методы нельзя!
//
//    Требования:
//    Интерфейс Animal должен быть реализован в классе Fox.
//    В классе Fox должен быть реализован только один метод (getName).
//    В интерфейсе Animal нужно объявить метод getColor.
//    Дополнительные классы или интерфейсы создавать нельзя.

import java.awt.*;

/*
Лисица — это такое животное
*/

public class Solution13 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}
