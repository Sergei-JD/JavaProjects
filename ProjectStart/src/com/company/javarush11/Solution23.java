package com.company.javarush11;

//    Напиши метод, который возвращает минимальное и максимальное числа в массиве.
//
//    Требования:
//    •	Программа не должна считывать данные с клавиатуры.
//    •	Класс Pair не изменяй.
//    •	Метод main не изменяй.
//    •	Допиши реализацию метода getMinimumAndMaximum: он должен возвращать пару из минимума и максимума.
//    •	Программа должна вывести правильный результат.
//    •	Метод getMinimumAndMaximum не должен изменять массив inputArray.

import java.util.Arrays;

public class Solution23 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] < min) {
                min = inputArray[i];
            }

            if(inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return new Pair<Integer, Integer>(min, max);

//        Сортировка при помощи метода sort класса Arrays
//        Arrays.sort(inputArray);
//        return new Pair<Integer, Integer>(inputArray[0], inputArray[9]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
