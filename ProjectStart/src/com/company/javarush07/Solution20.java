package com.company.javarush07;

//    Ввести с клавиатуры 2 числа N и M.
//    Ввести N строк и заполнить ими список.
//    Переставить M первых строк в конец списка.
//    Вывести список на экран, каждое значение с новой строки.
//
//    Примечание: запрещено создавать больше одного списка.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//    •	Переставить M первых строк в конец списка.
//    •	Выведи список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк для заполнения списка: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите число первых строк массива, которые будут переставлены в конец списка");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("Введите строки для заполнения списка");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        for (int i = m; i > 0; i--) {
            list.add(list.remove(0));
        }
        System.out.println("Вывод перестроеного списка");
        for (String str: list) {
            System.out.println(str);
        }
    }
}
