package com.company.javarush08;

//    Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
//    Удалить из словаря всех людей, родившихся летом.
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
//    •	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution16 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("APRIL 11 1998"));
        map.put("Петров", dateFormat.parse("JUNE 15 1999"));
        map.put("Блок", dateFormat.parse("SEPTEMBER 20 2015"));
        map.put("Есенин", dateFormat.parse("FEBRUARY 3 1986"));
        map.put("Пушкин", dateFormat.parse("AUGUST 30 2020"));
        map.put("Лермонтов", dateFormat.parse("JULY 27 1995"));
        map.put("Маяковский", dateFormat.parse("DECEMBER 7 2000"));
        map.put("Гоголь", dateFormat.parse("JANUARY 17 2005"));
        map.put("Тюччев", dateFormat.parse("MAY 26 2010"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> mapCopy = new HashMap<>(map);

//          Удаление элементов коллекции при помощи switch
//        for (Map.Entry<String, Date> pair : mapCopy.entrySet()) {
//            switch (pair.getValue().getMonth()) {
//                case 5, 6, 7 -> map.remove(pair.getKey());
//            }
//        }

//          Удаление при помощи логических операторов
        for (String key : mapCopy.keySet()) {
            Date date = mapCopy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map.values());

    }
}
