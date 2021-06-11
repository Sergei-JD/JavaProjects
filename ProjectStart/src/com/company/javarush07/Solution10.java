package com.company.javarush07;

//    1. Создай список строк в методе main.
//    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//    3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//    •	Программа должна добавлять строки в начало списка.
//    •	Программа должна выводить список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }

        for (String str: list) {
            System.out.println(str);
        }
    }
}
