package com.company.javarush04;
// Существует ли треугольник
// Подсказка: Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
//Требуется сравнить каждую сторону с суммой двух других.
//Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        if (c >= a + b | b >= a + c | a >= b + c )
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}
