package com.company.javarush07;

//    1. В методе initializeArray():
//    1.1. Создай массив на 20 чисел
//    1.2. Считай с консоли 20 чисел и заполни ими массив
//    2. Метод max(int[] array) должен находить максимальное число из элементов массива
//
//    Требования:
//    •	Метод initializeArray должен создавать массив из 20 целых чисел.
//    •	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
//    •	Метод max должен возвращать максимальный элемент из переданного массива.
//    •	Метод main изменять нельзя.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution01 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
