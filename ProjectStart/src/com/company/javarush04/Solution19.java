package com.company.javarush04;

//    Ввести с клавиатуры три числа, вывести на экран среднее из них.
//    Т.е. не самое большое и не самое маленькое.
//    Если все числа равны, вывести любое из них.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a >= b && a < c) || (a <= b && a >= c))
            System.out.println(a);
        else if ((b >= a && b <= c) || (b <= a && b >= c))
            System.out.println(b);
        else
            System.out.println(c);
    }
}
