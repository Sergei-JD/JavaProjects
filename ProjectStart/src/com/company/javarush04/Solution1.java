package com.company.javarush04;

//Задание: Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int year = Integer.parseInt(str);
        if (year % 400 ==0)
            System.out.println("количество дней в году: " + year + " - 366 для високсного года.");
        else if (year % 100 == 0)
            System.out.println("количество дней в году: " + year + " - 365 для обычного года.");
        else if (year % 4 == 0)
            System.out.println("количество дней в году: " + year + " - 366 для високсного года.");
        else
            System.out.println("количество дней в году: " + year + " - 365 для обычного года.");




    }
}
