package com.company.javarush07;

//    1. Введи с клавиатуры 10 слов в список строк.
//    2. Определить, является ли список упорядоченным по возрастанию длины строки.
//    3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
//
//    Требования:
//    •	Объяви переменную типа список строк и сразу проинициализируй ee.
//    •	Считай 10 строк с клавиатуры и добавь их в список.
//    •	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//    •	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(reader.readLine());
        }

        int minNum = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (minNum <= list.get(i).length()) {
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
