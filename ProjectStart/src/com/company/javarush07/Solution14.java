package com.company.javarush07;

//    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
//
//    Требования:
//    •	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//    •	Считай 5 строк с клавиатуры и добавь их в список.
//    •	Удали третий элемент списка.
//    •	Выведи элементы на экран, каждый с новой строки.
//    •	Порядок вывода должен быть обратный.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            str.add(reader.readLine());
        }

        str.remove(2);

        for (int i = str.size() - 1; i >= 0; i--) {
            System.out.println(str.get(i));
        }
    }
}
