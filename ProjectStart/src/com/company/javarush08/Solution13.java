package com.company.javarush08;

//    Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
//
//    Требования:
//    •	Не изменяй заголовок метода createSet().
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
//    •	Множество из метода createSet() должно содержать 20 слов на букву «Л».

import java.util.HashSet;
import java.util.Set;

public class Solution13 {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        set.add("липа");
        set.add("лектор");
        set.add("лобзик");
        set.add("луна");
        set.add("лес");
        set.add("ловкость");
        set.add("лавирование");
        set.add("лен");
        set.add("лира");
        set.add("лава");
        set.add("лев");
        set.add("лаз");
        set.add("лемур");
        set.add("лыжи");
        set.add("ладышка");
        set.add("лук");
        set.add("лужа");
        set.add("лик");
        set.add("лавры");
        set.add("лицо");
        return set;
    }

    public static void main(String[] args) {

    }
}
