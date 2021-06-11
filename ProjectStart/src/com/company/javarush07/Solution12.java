package com.company.javarush07;

//    1. Создай список строк.
//    2. Добавь в него 10 строчек с клавиатуры.
//    3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//    Если таких строк несколько, то должны быть учтены самые первые из них.
//    4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//    •	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
//    •	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
//    •	Должна быть выведена только одна строка.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int minStringLength = list.get(0).length();
        for (String str: list) {
            if (str.length() < minStringLength)
                minStringLength = str.length();
        }
        System.out.println("выводим самую коротку строку: " + minStringLength);

        int maxStringLength = list.get(0).length();
        for (String str: list) {
            if (str.length() > maxStringLength)
                maxStringLength = str.length();
        }
        System.out.println("выводим самую длиную строку: " + maxStringLength);

        for (String str: list) {
            if(str.length() == minStringLength) {
                System.out.println("первой встречается самая короткая строка: " + str);
                break;
            } else if (str.length() == maxStringLength) {
                System.out.println("первой встречается самая длиная строка: " + str);
                break;
            }
        }
    }
}
