package com.company.javarush08;

//    Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//    Удалить из множества все числа больше 10.
//
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Класс Solution должен содержать только три метода.
//    •	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//    •	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

import java.util.*;

public class Solution14 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i + 1);

        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> setCopy = new HashSet<>(set);
        for (Integer number : setCopy) {
            if (number > 10) {
                set.remove(number);
            }
        }
//      Перебор всей коллекции и удаление из него элементов выше 10
//        set.removeIf(number -> number >= 10);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = removeAllNumbersGreaterThan10(createSet());
        System.out.println(set);
    }
}
