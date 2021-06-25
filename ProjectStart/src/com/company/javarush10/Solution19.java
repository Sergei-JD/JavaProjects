package com.company.javarush10;

//    Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
//    Пояснение:
//    Самое минимальное число - 1-е минимальное.
//    Следующее минимальное после него - 2-е минимальное.
//
//    Пример:
//    1 6 5 7 1 15 63 88
//    Первое минимальное - 1
//    Второе минимальное - 1
//    Третье минимальное - 5
//    Четвертое минимальное - 6
//
//    Требования:
//    •	Программа должна считывать данные с клавиатуры.
//    •	Программа должна выводить текст на экран.
//    •	Класс Solution должен содержать два метода.
//    •	Метод sort() должен сортировать массив элементов.
//    •	Метод main() должен вызывать метод sort().
//    •	Программа должна выводить 10-е и 11-е минимальные числа. Каждое значение - с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
*/

public class Solution19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {

//        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}
