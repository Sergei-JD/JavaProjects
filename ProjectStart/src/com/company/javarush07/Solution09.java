package com.company.javarush07;

//    1. Создай список строк.
//    2. Считай с клавиатуры 5 строк и добавь в список.
//    3. Используя цикл, найди самую короткую строку в списке.
//    4. Выведи найденную строку на экран.
//    5. Если таких строк несколько, выведи каждую с новой строки.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
//    •	Программа должна выводить самую короткую строку на экран.
//    •	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int minStringLegth = list.get(0).length();
        for (String string: list) {
            if (string.length() < minStringLegth)
                minStringLegth = string.length();
        }

        for (String string: list) {
            if (string.length() == minStringLegth)
                System.out.println(string);
        }
    }
}
