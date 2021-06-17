package com.company.javarush08;

//    Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//    Удалить из словаря всех людей, у которых зарплата ниже 500.
//
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer
//            состоящих из 10 записей по принципу «фамилия» - «зарплата».
//    •	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.

import java.util.HashMap;
import java.util.Map;

public class Solution18 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Сидоров", 600);
        map.put("Иванов", 300);
        map.put("Слепаков", 1500);
        map.put("Петров", 500);
        map.put("Леонов", 900);
        map.put("Кот", 1000);
        map.put("Мялик", 400);
        map.put("Комаров", 800);
        map.put("Пушкин", 1200);
        map.put("Комар", 350);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair: mapCopy.entrySet()) {
            if(pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map.values());

    }
}
