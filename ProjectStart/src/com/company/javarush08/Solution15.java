package com.company.javarush08;

//    Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//    Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
//
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
//    •	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
//    •	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.

import java.util.HashMap;
import java.util.Map;

public class Solution15 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Сидоров", "Павел");
        map.put("Иванов", "Семен");
        map.put("Слепаков", "Иван");
        map.put("Петров", "Дмитрий");
        map.put("Леонов", "Денис");
        map.put("Кот", "Виктро");
        map.put("Мялик", "Евгений");
        map.put("Комаров", "Александр");
        map.put("Пушкин", "Тимофей");
        map.put("Комар", "Надежда");
    return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nameMapFirst : map.values()) {
            if(nameMapFirst.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String nameMapLast: map.keySet()) {
            if(nameMapLast.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
