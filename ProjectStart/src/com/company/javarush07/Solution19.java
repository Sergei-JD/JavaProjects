package com.company.javarush07;

//    Ввести с клавиатуры 10 чисел и заполнить ими список.
//    Вывести их в обратном порядке. Каждый элемент - с новой строки.
//    Использовать только цикл for.
//
//    Подсказка:
//    Не забудь импортировать класс: java.util.ArrayList;
//
//    Требования:
//    •	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
//    •	Считай 10 целых чисел с клавиатуры и добавь их в список.
//    •	Выведи числа в обратном порядке.
//    •	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
