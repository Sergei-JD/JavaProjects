package com.company.javarush05;

//Написать программу, которая:
//        1. считывает с консоли число N, которое должно быть больше 0
//        2. потом считывает N чисел с консоли
//        3. выводит на экран максимальное из введенных N чисел.
//
//        Требования:
//        •	Программа должна считывать числа с клавиатуры.
//        •	Программа должна выводить число на экран.
//        •	В классе должен быть метод public static void main.
//        •	Нельзя добавлять новые методы в класс Solution.
//        •	Программа должна выводить на экран максимальное из введенных N чисел.
//        •	Программа не должна ничего выводить на экран, если N меньше либо равно 0.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > maximum) {
                    maximum = number;
                }
            }
            System.out.println(maximum);
        }
    }
}
