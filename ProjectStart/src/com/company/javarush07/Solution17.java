package com.company.javarush07;

//    1. Введи с клавиатуры 10 слов в список строк.
//    2. Метод doubleValues должен удваивать слова по принципу:
//    "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//    3. Выведи результат на экран, каждое значение с новой строки.
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Считай 10 строк с клавиатуры и добавь их в список.
//    •	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
//    •	Выведи получившийся список на экран, каждый элемент с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution17 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String string: result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String string: list) {
            result.add(string);
            result.add(string);
        }
        return result;
    }
}
