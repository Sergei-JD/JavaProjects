package com.company.javarush07;

//    1. Создай список строк.
//    2. Добавь в него 5 строк с клавиатуры.
//    3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//    4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Программа должна считывать 5 строк с клавиатуры.
//    •	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//    •	Программа должна выводить список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(4));
            list.remove(5);
        }

        for (String str: list) {
            System.out.println(str);
        }
    }
}
