package com.company.javarush08;

//    1. Ввести с клавиатуры число N.
//    2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//    3. Найти минимальное число среди элементов списка - метод getMinimum.
//
//    Требования:
//    •	Программа должна выводить текст на экран.
//    •	Программа должна считывать значения с клавиатуры.
//    •	Класс Solution должен содержать только три метода.
//    •	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
//    •	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
//    •	Метод main() должен вызывать метод getIntegerList().
//    •	Метод main() должен вызывать метод getMinimum().

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution24 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
//          Вывод минимального числа с помощью класса Collections
//        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите количество считываемых чисел:");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
