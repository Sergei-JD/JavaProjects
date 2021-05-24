package com.company.javarush04;

//  Ввести с клавиатуры три целых числа.
//  Вывести на экран количество положительных чисел среди этих трех.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = 0;

        if (a > 0)
            x++;
        if (b > 0)
            x++;
        if (c > 0)
            x++;
        System.out.println(x);
    }
}
