package com.company.javarush04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
//        "количество отрицательных чисел: а", "количество положительных чисел: б",
//        где а, б - искомые значения.

public class Solution14 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = 0;
        int y = 0;

        if (a < 0)
            x++;
        else if (a > 0)
            y++;

        if (b < 0)
            x++;
        else if (b > 0)
            y++;

        if (c < 0)
            x++;
        else if (c > 0)
            y++;
        System.out.println("количество отрицательных чисел: " + x);
        System.out.println("количество положительных чисел: " + y);
    }
}
