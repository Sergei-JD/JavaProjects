package com.company.javarush07;

//    Создать список строк.
//    Ввести строки с клавиатуры и добавить их в список.
//    Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
//    Вывести строки на экран, каждую с новой строки.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
//    •	Саму строку "end" не нужно добавлять в список.
//    •	Выведи список на экран, каждое значение с новой строки.
//    •	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; ; i++) {
            String s = reader.readLine();
            if (s.equals("end"))
                break;
            else
                list.add(s);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}
