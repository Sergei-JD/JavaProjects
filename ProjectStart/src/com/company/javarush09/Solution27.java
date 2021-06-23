package com.company.javarush09;

//    Есть класс кот - Cat, с полем "имя" (String).
//    Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//    Получить из Map множество(Set) всех котов и вывести его на экран.
//
//    Требования:
//    •	Программа не должна считывать данные с клавиатуры.
//    •	Метод createMap должен создавать новый объект HashMap<String, Cat>.
//    •	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//    •	Метод createMap должен возвращать созданный словарь.
//    •	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//    •	Программа должна вывести всех котов из множества на экран.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution27 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("Vaska", new Cat("vaska"));
        map.put("Murzik", new Cat("murzik"));
        map.put("Igor", new Cat("igor"));
        map.put("Victor", new Cat("viktor"));
        map.put("Dimon", new Cat("dimon"));
        map.put("Doc", new Cat("doc"));
        map.put("Deniska", new Cat("deniska"));
        map.put("Vovan", new Cat("vovan"));
        map.put("Kostja", new Cat("kostja"));
        map.put("Simon", new Cat("simon"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat>catSet = new HashSet<Cat>(map.values());

        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
