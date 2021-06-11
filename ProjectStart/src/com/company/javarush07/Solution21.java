package com.company.javarush07;

//    Создать массив на 20 чисел.
//    Заполнить его числами с клавиатуры.
//    Найти максимальное и минимальное числа в массиве.
//    Вывести на экран максимальное и минимальное числа через пробел.
//
//    Требования:
//    •	В классе Solution создай статический публичный метод int[] getInts().
//    •	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
//    •	В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
//    •	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution21 {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;

        int [] array = getInits();

        maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(maximum < array[i])
                maximum = array[i];
        }

        minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(minimum > array[i])
                minimum = array[i];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int [] getInits() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
