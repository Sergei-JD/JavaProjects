package com.company.javarush04;

//    Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
//    Вывести на экран порядковый номер числа, отличного от остальных.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b & a != c)
            System.out.println(3);
        else if (a == c & a != b)
            System.out.println(2);
        else if (b == c & b != a)
            System.out.println(1);
    }
}
