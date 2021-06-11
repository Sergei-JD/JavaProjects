package com.company.javarush07;

import java.util.ArrayList;

//    1. Создай список строк.
//    2. Добавь в него 5 различных строк.
//    3. Выведи его размер на экран.
//    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//
//    Требования:
//    •	Программа не должна ничего считывать с клавиатуры.
//    •	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//    •	Программа должна добавить 5 любых строк в список.
//    •	Программа должна вывести размер списка на экран.
//    •	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.

public class Solution07 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");

        System.out.println(list.size());

        for (String string: list) {
            System.out.println(string);
        }
    }
}
